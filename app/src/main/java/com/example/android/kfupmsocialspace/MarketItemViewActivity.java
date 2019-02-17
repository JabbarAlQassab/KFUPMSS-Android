package com.example.android.kfupmsocialspace;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.kfupmsocialspace.model.MarketItem;
import com.squareup.picasso.Picasso;

//https://www.youtube.com/watch?v=SD2t75T5RdY
public class MarketItemViewActivity extends AppCompatActivity {

    private TextView itemName, itemPrice, itemCategory, itemDescription, itemOwner;
    private ImageView itemImg;

    private MarketItem marketItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_item_view);

        itemName = findViewById(R.id.itemName);
        itemPrice = (TextView) findViewById(R.id.item_price);
        itemDescription = findViewById(R.id.itemDescription);
        itemImg = findViewById(R.id.item_thumbnail);
        itemCategory = findViewById(R.id.txtCat);
        itemOwner = findViewById(R.id.owner);


        marketItem = (MarketItem) getIntent().getParcelableExtra("clickedItem");

        itemName.setText(marketItem.getItemName());
//        itemPrice.setText(marketItem.getItemPrice());
        itemDescription.setText(marketItem.getItemDescription());
        Picasso.with(this).load(Uri.parse(marketItem.getItemPicture())).fit().centerCrop().into(itemImg);
        itemOwner.setText(marketItem.getItemOwner());
        itemCategory.setText(marketItem.getItemCategory());
        itemPrice.setText(marketItem.getItemPrice());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
        }
        return true;
    }
    
}
