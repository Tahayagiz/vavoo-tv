package com.vavoo.client

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.FragmentActivity
import androidx.media3.ui.PlayerView
import com.vavoo.client.player.ExoPlayerManager

class MainActivity : FragmentActivity() {
    private lateinit var playerView: PlayerView
    private lateinit var playerManager: ExoPlayerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        playerView = PlayerView(this)
        setContentView(playerView)
        playerManager = ExoPlayerManager(this, playerView)
        playerManager.playStream("http://localhost:8080/proxy?url=https://vavoo.to/live/test.m3u8")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return when (keyCode) {
            KeyEvent.KEYCODE_DPAD_UP -> { /* Channel Up */ true }
            KeyEvent.KEYCODE_DPAD_DOWN -> { /* Channel Down */ true }
            else -> super.onKeyDown(keyCode, event)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        playerManager.release()
    }
}
