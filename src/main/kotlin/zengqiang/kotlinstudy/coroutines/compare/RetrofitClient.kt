package zengqiang.kotlinstudy.coroutines.compare

import retrofit2.Retrofit

object RetrofitClient {
    const val URL = "https://www.wanandroid.com"
    val retrofitClient = Retrofit.Builder()
        .baseUrl(URL)
        .build()
}