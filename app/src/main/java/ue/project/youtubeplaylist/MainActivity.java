package ue.project.youtubeplaylist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> YtVideoID = new ArrayList<>();
    ArrayList<YouTubePlayerView> resourcesID = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resourcesID.add(findViewById(R.id.youtube_player_view0));
        resourcesID.add(findViewById(R.id.youtube_player_view1));
        resourcesID.add(findViewById(R.id.youtube_player_view2));
        resourcesID.add(findViewById(R.id.youtube_player_view3));

        YtVideoID.add("rGw6XcHUArc");
        YtVideoID.add("VRUCHHxQ4Bs");
        YtVideoID.add("7u3KpSaXNoc");
        YtVideoID.add("qpoAmKf7YZQ");

        for(int i = 0; i < YtVideoID.size(); i++){
            int finalI = i;
            String YPV = "youtube_player_view"+String.valueOf(finalI);
            resourcesID.get(finalI).addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    String videoId = YtVideoID.get(finalI);
                    // To play the video auto
                    // youTubePlayer.loadVideo(videoId,0);

                    // To play the video when clicking on play
                    youTubePlayer.cueVideo(videoId,0);
                }
            });
        }
    }
}
