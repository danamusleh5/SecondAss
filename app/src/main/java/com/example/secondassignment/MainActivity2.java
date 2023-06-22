package com.example.secondassignment;


import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.content.SharedPreferences;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        RecyclerView recycler = findViewById(R.id.subject_recycler);

        String[] captions = new String[Subject.subjects.length];
        int[] ids = new int[Subject.subjects.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Subject.subjects[i].getName();
            ids[i] = Subject.subjects[i].getImageID();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions,ids);
        recycler.setAdapter(adapter);

          //Shared Prefrences
       SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
       editor.putString("key", "value");
        editor.apply();
        String value = sharedPreferences.getString("key", "");
     //   SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove("key");
        editor.apply();
    }













}
