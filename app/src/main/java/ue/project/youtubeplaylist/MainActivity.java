package ue.project.youtubeplaylist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {
    private YouTubePlayerView youtube_player_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtube_player_view = findViewById(R.id.youtube_player_view);

        youtube_player_view.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "rGw6XcHUArc";
                // To play the video auto
//                youTubePlayer.loadVideo(videoId,0);

                // To play the video when clicking on play
                youTubePlayer.cueVideo(videoId,0);
            }
        });
    }
}
