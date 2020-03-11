package kve.ru.tomandjerry;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  private ImageView tomImageView;
  private ImageView jerryImageView;
  private boolean isTomVisible = true;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tomImageView = findViewById(R.id.tomImageView);
    jerryImageView = findViewById(R.id.jerryImageView);
  }

  public void onClickTomOrJerry(View view) {
    if (isTomVisible) {
      isTomVisible = false;
      tomImageView.animate().alpha(0).rotation(tomImageView.getRotation() + 3600).scaleX(0).scaleY(0).setDuration(3000);
      jerryImageView.animate().alpha(1).rotation(jerryImageView.getRotation() + 3600).scaleX(1).scaleY(1).setDuration(3000);
    } else {
      isTomVisible = true;
      jerryImageView.animate().alpha(0).rotation(jerryImageView.getRotation() + 3600).scaleX(0).scaleY(0).setDuration(3000);
      tomImageView.animate().alpha(1).rotation(tomImageView.getRotation() + 3600).scaleX(1).scaleY(1).setDuration(3000);
    }
  }
}
