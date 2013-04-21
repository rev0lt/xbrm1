package com.rev0lt.xbrm1;

import java.io.IOException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Xbrm1Activity extends Activity {
    /** Called when the activity is first created. */
	String s2;
 public	BasicResponseHandler myHandler = new BasicResponseHandler();	
 public	HttpClient cli=new DefaultHttpClient();
    public String encodings(String s)
    {
    	String k=null;
		try {
			k = URLEncoder.encode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return k;
    }
    public String responding(String d)
    {
    	String ret=null;
    	
    	try {
			HttpResponse resp=cli.execute(new HttpGet(d));
		 ret=myHandler.handleResponse(resp);
		 
				
			
			//Toast.makeText(getApplicationContext(),(String)resp, 
	          //      Toast.LENGTH_LONG).show();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return ret;		
    }
    public void sets2(String s)
    {
    	s2=s;
    	
    	Toast.makeText(getApplicationContext(),(String)s2,Toast.LENGTH_LONG).show();
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
          
         
         // s="http://192.168.1.5:8080/jsonrpc?request=%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Player.GetActivePlayers%22%2C%20%22id%22%3A%201%7D";
        
        //HttpGet("http://192.168.1.5:8080/jsonrpc?request={"jsonrpc": "2.0", "method": "Player.GetActivePlayers", "id": 1}");
      //final  HttpClient httplient = new DefaultHttpClient();
      //final  EditText et =(EditText)findViewById(R.id.textView2);
        Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);
        Button b5= (Button)findViewById(R.id.button5);
        Button b6= (Button)findViewById(R.id.button6);
        Button b7= (Button)findViewById(R.id.button7);
        Button b8= (Button)findViewById(R.id.button8);
        Button b9= (Button)findViewById(R.id.button9);
        Button b10= (Button)findViewById(R.id.button10);
        Button b11=(Button)findViewById(R.id.button11);
      final  EditText et=(EditText)findViewById(R.id.editText1);
       // Button b9= (Button)findViewById(R.id.button9);
      ToggleButton t1 =(ToggleButton)findViewById(R.id.toggleButton1);
        //  RadioButton r1 =(RadioButton)findViewById(R.id.radioButton1);
        final  WebView w =(WebView)findViewById(R.id.webView1);
        //final   EditText et = (EditText) findViewById(R.id.editText1);
        
   s2="http://192.168.1.5:8080/jsonrpc?request=";
   b11.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String s1;
		s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Back\", \"id\": 1}");
		
		// TODO Auto-generated catch block
	
	//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
 String s4 = s2+s1;
	 // s2=s2+s;
 	// s2=s2+s;
 
 String k=responding(s4);
 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
	}
});
   b9.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
		sets2("http://"+ et.getText().toString()+":8080/jsonrpc?request=");
	}
});
   b10.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
	et.setText("");	// TODO Auto-generated method stub
		
	}
});
        
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 String s1 = null;
			 
				s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Application.Quit\", \"id\": 1}");
			
				// TODO Auto-generated catch block
			
			
			 ;//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
		 String s4 = s2+s1;
			 // s2=s2+s;
		 	// s2=s2+s;
		 
		 String k=responding(s4);
		 w.loadData(k,"text/html", "UTF-8");
			}
		});
        b2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				String s1;
				s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Left\", \"id\": 1}");
				
				// TODO Auto-generated catch block
			
			//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
		 String s4 = s2+s1;
			 // s2=s2+s;
		 	// s2=s2+s;
		 
		 String k=responding(s4);
		 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
				
			}
		});
        
        b3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				String s1;
				s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Right\", \"id\": 1}");
				
				// TODO Auto-generated catch block
			
			//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
		 String s4 = s2+s1;
			 // s2=s2+s;
		 	// s2=s2+s;
		 
		 String k=responding(s4);
		 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
				
			}
		});
        
  b4.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				String s1;
				s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Down\", \"id\": 1}");
				
				// TODO Auto-generated catch block
			
			//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
		 String s4 = s2+s1;
			 // s2=s2+s;
		 	// s2=s2+s;
		 
		 String k=responding(s4);
		 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
				
			}
		});
  
  b5.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			String s1;
			s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Up\", \"id\": 1}");
			
			// TODO Auto-generated catch block
		
		//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
	 String s4 = s2+s1;
		 // s2=s2+s;
	 	// s2=s2+s;
	 
	 String k=responding(s4);
	 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
			
		}
	});
  b6.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			String s1;
			s1=encodings("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Select\", \"id\": 1}");
			
			// TODO Auto-generated catch block
		
		//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
	 String s4 = s2+s1;
		 // s2=s2+s;
	 	// s2=s2+s;
	 
	 String k=responding(s4);
	 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
			
		}
	});
  
  b7.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			String s1;
			s1=encodings("{\"jsonrpc\":\"2.0\",\"method\":\"Player.Stop\",\"params\":{\"playerid\":1},\"id\":1}");
			
			// TODO Auto-generated catch block
		
		//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
	 String s4 = s2+s1;
		 // s2=s2+s;
	 	// s2=s2+s;
	 
	 String k=responding(s4);
	 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
			
		}
	});
  b8.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			String s1;
			s1=encodings("{\"jsonrpc\":\"2.0\",\"method\":\"Player.PlayPause\",\"params\":{\"playerid\":1},\"id\":1}");
			
			// TODO Auto-generated catch block
		
		//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
	 String s4 = s2+s1;
		 // s2=s2+s;
	 	// s2=s2+s;
	 
	 String k=responding(s4);
	 w.loadData(k,"text/html", "UTF-8");	// TODO Auto-generated method stub
			
		}
	});
    t1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String s1;
			s1=encodings("{\"jsonrpc\":\"2.0\",\"method\":\"Application.SetMute\",\"params\":{\"mute\":\"toggle\"},\"id\":1}");
			
			// TODO Auto-generated catch block
		
		//%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Application.Quit%22%2C%20%22id%22%3A%201%7D";
	 String s4 = s2+s1;
		 // s2=s2+s;
	 	// s2=s2+s;
	 
	 String k=responding(s4);
	 w.loadData(k,"text/html", "UTF-8");
			
		}
	});
   
    }
}