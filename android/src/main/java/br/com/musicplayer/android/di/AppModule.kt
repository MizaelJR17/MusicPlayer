package br.com.musicplayer.android.di

import android.content.Context
import br.com.musicplayer.android.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponentManager::class)
object AppModule {
    @Singleton
    @Provides
    fun provideGlideInstance(
        @ApplicationContext context: Context
    ) = Glide.with(context).setDefaultRequestOptions(

        RequestOptions()
            .placeholder(androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha)
            .error(androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
    )



}