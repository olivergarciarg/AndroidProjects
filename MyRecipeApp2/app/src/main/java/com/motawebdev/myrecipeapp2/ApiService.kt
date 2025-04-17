package com.motawebdev.myrecipeapp2

//import okhttp3.Proxy;

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import okhttp3.Authenticator
import okhttp3.Credentials
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import okhttp3.logging.HttpLoggingInterceptor;
import java.net.InetSocketAddress
import java.net.Proxy

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse

}



// Function to initialize the proxy in a background thread
//suspend fun createProxy(): Proxy = withContext(Dispatchers.IO) {
//    Proxy(Proxy.Type.HTTP, InetSocketAddress("sub.proxy.att.com", 8080))
//}
//
//// Function to initialize the OkHttpClient in a background thread
//suspend fun createOkHttpClient(proxy: Proxy): OkHttpClient = withContext(Dispatchers.IO) {
//    val proxyAuthenticator = object : Authenticator {
//        override fun authenticate(route: Route?, response: Response): Request? {
//            val credential = Credentials.basic("og961v", "Androidstudio$1982")
//            return response.request.newBuilder()
//                .header("Proxy-Authorization", credential)
//                .build()
//        }
//    }
//
//    val loggingInterceptor = HttpLoggingInterceptor().apply {
//        level = HttpLoggingInterceptor.Level.BODY
//    }
//
//    OkHttpClient.Builder()
//        .proxy(proxy)
//        .proxyAuthenticator(proxyAuthenticator)
//        .addInterceptor(loggingInterceptor)
//        .build()
//}
//
//// Function to initialize Retrofit in a background thread
//suspend fun createRetrofit(okHttpClient: OkHttpClient): Retrofit = withContext(Dispatchers.IO) {
//    Retrofit.Builder()
//        .baseUrl("https://www.themealdb.com/api/json/v1/1/")
//        .client(okHttpClient)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//}
//
//// Lazy initialization of the ApiService
//suspend fun createApiService(): ApiService {
//    val proxy = createProxy()
//    val okHttpClient = createOkHttpClient(proxy)
//    val retrofit = createRetrofit(okHttpClient)
//    return retrofit.create(ApiService::class.java)
//}
//
//interface ApiService{
//    @GET("categories.php")
//    suspend fun getCategories():CategoriesResponse
//
//}