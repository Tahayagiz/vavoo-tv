package com.vavoo.client.player

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

class ExoPlayerManager(context: Context, private val playerView: PlayerView) {
    private var player: ExoPlayer = ExoPlayer.Builder(context).build()
    init { playerView.player = player }
    fun playStream(url: String) {
        player.setMediaItem(MediaItem.fromUri(url))
        player.prepare()
        player.play()
    }
    fun release() { player.release() }
}
