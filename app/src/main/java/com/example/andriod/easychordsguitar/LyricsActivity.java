package com.example.andriod.easychordsguitar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LyricsActivity extends AppCompatActivity {
PDFView pdfView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lyrics);
		pdfView =(PDFView) findViewById(R.id.pdfView);
		pdfView.fromAsset("sample.pdf").load();
	}
}
