package edu.cnm.deepdive.roulette.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import edu.cnm.deepdive.roulette.R;
import edu.cnm.deepdive.roulette.service.GoogleSignInService;

public class MainActivity extends AppCompatActivity {

  private AppBarConfiguration appBarConfiguration; // declaration of Field
  private NavController navController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationView navView = findViewById(R.id.nav_view);
    appBarConfiguration = new AppBarConfiguration.Builder(
        R.id.navigation_play, R.id.navigation_history, R.id.navigation_statistics)
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

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.options, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    boolean handled = true;
    //noinspection SwitchStatementWithTooFewBranches
    switch (item.getItemId()) {
      case R.id.sign_out:
        GoogleSignInService
            .getInstance() // getting the instance of google sign in services
            .signOut() // signing out
        .addOnCompleteListener((ignored) ->  //waits for button to be pushed basically
          startActivity( //once button is pushed this happens
              new Intent(this, LoginActivity.class)
                  .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK)
          )
        );
        break;
        // Add more cases as necessary
      default:
        handled = super.onOptionsItemSelected(item);
    }
    return handled;
  }
}