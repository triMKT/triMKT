package com.example.david.trimkt;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class principal_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Fragment recomendadoFragment;
    private Fragment emAltaFragment;
    private Fragment comprasDiaFragment;
    private Fragment listaComprasFragment;
    private Fragment localizacaoFragment;

    private FrameLayout framePrincipal;
    private BottomNavigationView bottomNavigation;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_recomendado:
//                    bottomNavigation.setItemBackgroundResource(R.color.colorAccent);
                    framePrincipal.setBackgroundResource(R.color.Amarelo);
                    setFragment(recomendadoFragment);
                    return true;
                case R.id.navigation_emAlta:
//                    bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
                    framePrincipal.setBackgroundResource(R.color.Azul);
                    setFragment(emAltaFragment);
                    return true;
                case R.id.navigation_comprasDia:
//                    bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
                    framePrincipal.setBackgroundResource(R.color.Verde);
                    setFragment(comprasDiaFragment);
                    return true;
                case R.id.navigation_listaCompras:
//                    bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
                    framePrincipal.setBackgroundResource(R.color.Vermelho);
                    setFragment(listaComprasFragment);
                    return true;
                case R.id.navigation_localizacao:
//                    bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
                    framePrincipal.setBackgroundResource(R.color.Rosa);
                    setFragment(localizacaoFragment);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Inicializando fragments
        recomendadoFragment = new recomendadoFragment();
        emAltaFragment = new emAltaFragment();
        comprasDiaFragment = new comprasDiaFragment();
        listaComprasFragment = new listaComprasFragment();
        localizacaoFragment = new localizacaoFragment();

        //Inicializando FrameLayout//BottomNavigationView -> activity_principal_bottom
        framePrincipal = (FrameLayout) findViewById(R.id.framePrincipal) ;
        bottomNavigation= (BottomNavigationView) findViewById(R.id.bottomNavigation);

        setFragment(recomendadoFragment);

        BottomNavigationView navigation = findViewById(R.id.bottomNavigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


//        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.navigation_recomendado:
//                        bottomNavigation.setItemBackgroundResource(R.color.colorPrimary);
////                        setFragment(recomendadoFragment);
//                        return true;
//                    case R.id.navigation_emAlta:
//                        bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
////                        setFragment(emAltaFragment);
//                        return true;
//                    case R.id.navigation_comprasDia:
//                        bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
////                        setFragment(comprasDiaFragment);
//                        return true;
//                    case R.id.navigation_listaCompras:
//                        bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
////                        setFragment(listaComprasFragment);
//                        return true;
//                    case R.id.navigation_localizacao:
//                        bottomNavigation.setItemBackgroundResource(R.color.colorPrimaryDark);
////                        setFragment(localizacaoFragment);
//                        return true;
//                    default:
//                        return false;
//                }
//            }
//        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal_, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()){
            case R.id.nav_favoritos:
                framePrincipal.setBackgroundResource(R.color.Verde);
                setFragment(comprasDiaFragment);
                acaoDrawerLayout();
                return true;
            case R.id.nav_conta:
                framePrincipal.setBackgroundResource(R.color.Rosa);
                setFragment(recomendadoFragment);
                acaoDrawerLayout();
                return true;
            case R.id.nav_sair:
                acaoDrawerLayout();
                return true;
            case R.id.nav_ajuda:
                acaoDrawerLayout();
                return true;
            case R.id.nav_compartilhar:
                acaoDrawerLayout();
                return true;
        }
        return true;
    }

    public void acaoDrawerLayout(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framePrincipal, fragment);
        fragmentTransaction.commit();
    }
}