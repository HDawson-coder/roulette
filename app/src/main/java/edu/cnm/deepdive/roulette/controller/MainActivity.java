package edu.cnm.deepdive.roulette.controller;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import edu.cnm.deepdive.roulette.R;

public class MainActivity extends AppCompatActivity {

  private AppBarConfiguration appBarConfiguration; // declaration of Field
  private NavController navController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationView navView = findViewById(R.id.nav_view);
    appBarConfiguration = new AppBarConfiguration.Builder(
        R.id.navigation_play, R.id.navigation_dashboard, R.id.navigation_notifications)
        .build();
    navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    NavigationUI.setupWithNavController(navView, navController);
  }

  @Override
  public boolean onSupportNavigateUp() { // || means or
    return NavigationUI.navigateUp(navController,appBarConfiguration)
        || super.onSupportNavigateUp(); // this method is telling the app to return to the 'pop' fragment
  }
}