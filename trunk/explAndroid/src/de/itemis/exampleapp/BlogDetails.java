
package de.itemis.exampleapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import de.itemis.base.AbstractRowAdapter;
import de.itemis.base.GenericItemAdapter;
import de.itemis.base.GenericListActivity;
import de.itemis.base.DetailsActivity;
import de.itemis.base.RowAdapter;
import de.itemis.base.SimpleItemContentProvider;
import de.itemis.base.LabeledIntent;

import com.google.common.base.Splitter;
import static de.itemis.base.StringUtils.*;

public class BlogDetails extends DetailsActivity<BlogItem> {

	
	
	BlogItem item;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("blog post");
		
		
		
		item = getItemFromProvider();
		
		

		

setHeaderTitle(item.getTitle());
setHeaderDetails(item.getDescription());
setHeaderImageURL("http://blogs.itemis.de/wp-content/themes/itemis-WP-Theme/photos/" + urlconform(item.getAuthor()) + ".jpg");

		
		
		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();
		
			

	rowAdapters.add(new Cell1(null));


		
			

	rowAdapters.add(new Cell2(null));


		
		
		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();
		
	}
	
	
		
	
		private class Cell1 extends RowAdapter.Default<Void> {
	
			public Cell1(Void item) {
				super(item);
			}
			
			@Override
			public void populateRowView() {
				
				setText(item.getAuthor());
				
				
			}
	
			@Override
			public void handleClick() {
				
			
			Intent intent = new Intent(BlogDetails.this, BlogDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(item);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

			}
			
		}
	

	
		
	
		private class Cell2 extends RowAdapter.Default<Void> {
	
			public Cell2(Void item) {
				super(item);
			}
			
			@Override
			public void populateRowView() {
				
				setText("Open in Safari");
				
				
			}
	
			@Override
			public void handleClick() {
				
			
			Intent intent = new LabeledIntent(Intent.ACTION_VIEW, Uri.parse(item.getLink()));
			startActivity(intent);

			}
			
		}
	

	
}
