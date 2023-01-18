package ru.netology.nmedia.di


class DependencyContainer(
) {/*
    val appAuth = AppAuth(context)

    private val logging = HttpLoggingInterceptor().apply {
        if (BuildConfig.DEBUG) {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val okhttp = OkHttpClient.Builder()
        .addInterceptor(logging)
        .addInterceptor {chain ->
            appAuth.authStateFlow.value.token?.let {token ->
                val newRequest = chain.request().newBuilder()
                    .addHeader("Authorization", token)
                    .build()
                return@addInterceptor chain.proceed(newRequest)
            }
            chain.proceed(chain.request())
        }
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okhttp)
        .build()

    private val appDb = Room.databaseBuilder(context, AppDb::class.java, "app.db")
        .fallbackToDestructiveMigration()
        .build()

    val apiService = retrofit.create<ApiService>()

    private val postDao = appDb.postDao()

    val repository: PostRepository = PostRepositoryImpl(
        postDao,
        apiService
    )

    companion object {
        private const val BASE_URL = "${BuildConfig.BASE_URL}/api/slow/"

        @Volatile
        private var instance: DependencyContainer? = null

        fun initApp(context: Context) {
            instance = DependencyContainer(context)
        }

        fun getInstance(): DependencyContainer {
            return instance!!
        }

    }*/
}