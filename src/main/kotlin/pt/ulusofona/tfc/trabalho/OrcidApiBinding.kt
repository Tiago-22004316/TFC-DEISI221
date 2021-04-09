package pt.ulusofona.tfc.trabalho

import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

const val ORCID_API_BASE_URL = "https://api.sandbox.orcid.org/v3.0/"

open class OrcidApiBinding(accessToken: String?) {

    open val restTemplate: RestTemplate = RestTemplate()

    init {
        restTemplate.setRequestFactory(HttpComponentsClientHttpRequestFactory())
        if (accessToken != null) {
            restTemplate.interceptors.add(getBearerTokenInterceptor(accessToken))
        } else {
            restTemplate.interceptors.add(getNoTokenInterceptor())
        }
    }

    private fun getBearerTokenInterceptor(accessToken: String): ClientHttpRequestInterceptor {
        return ClientHttpRequestInterceptor { request, bytes, execution ->
            request.getHeaders().add("Authorization", "Bearer $accessToken")
            execution.execute(request, bytes)
        }
    }

    private fun getNoTokenInterceptor(): ClientHttpRequestInterceptor {
        return ClientHttpRequestInterceptor { _, _, _ ->
            throw IllegalStateException("Can't access the API without an access token")
        }
    }

    fun getRecord(orcid: String): String? {
        return restTemplate.getForObject(ORCID_API_BASE_URL + orcid + "/record", String::class.java)
    }
}