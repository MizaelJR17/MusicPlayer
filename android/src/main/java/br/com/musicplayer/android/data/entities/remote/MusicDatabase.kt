package br.com.musicplayer.android.data.entities.remote

import br.com.musicplayer.android.data.entities.Song
import br.com.musicplayer.android.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDatabase {
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)



    suspend fun getAllSongs():List<Song>{

            return try{
                songCollection.get().await().toObjects(Song::class.java)
            }catch (error : Exception){
                emptyList()
            }
    }
}