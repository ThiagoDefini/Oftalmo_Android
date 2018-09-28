package com.techsix.techsix_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class TelaInformacoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_informacoes);
    }


}





    /*
        private ListView lvPaciente;
        private List<Paciente> ConsultaPessoal;
        private ArrayAdapter adapter;
        private FirebaseDatabase database;
        private DatabaseReference reference;
        private Query queryRef;
        private ChildEventListener childEventListener;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tela_informacoes);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            lvPaciente = (ListView) findViewById(R.id.lvPaciente);
            ConsultaPessoal = new ArrayList<>();
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ConsultaPessoal);
            ConsultaPessoal.setAdapter(adapter);

            database = FirebaseDatabase.getInstance();
            reference = database.getReference();

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(ListaPlayersActivity.this, CadastroPacienteActivity.class);
                    startActivity(i);
                }
            });
        }



        @Override
        protected void onStart() {
            super.onStart();

            queryRef = reference.child("pacientes").orderByChild("nome");

            listaDejogadores.clear();

            childEventListener = new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    Jogador jogador = new Jogador();
                    jogador.setId(dataSnapshot.getKey());
                    jogador.setNome(dataSnapshot.child("nome").getValue(String.class));
                    jogador.setIdade(dataSnapshot.child("idade").getValue(Integer.class));
                    listaDejogadores.add(jogador);
                    adapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            };
            queryRef.addChildEventListener(childEventListener);
        }

        @Override
        protected void onStop() {
            super.onStop();
            queryRef.removeEventListener(childEventListener);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            menu.add("Sair");

            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            if (item.toString().equals("Sair")){
                FirebaseAuth.getInstance().signOut();
                finish();
            }

            return super.onOptionsItemSelected(item);
        }
    }



}

*/
