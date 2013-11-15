Imagino
=======
Hello.

	Imagino is the Image Library For Android.
	It is used to load Image from Remote Url. So what is new in that ?
	Here comes the advantage of using it. 
	
	* It allows to fetch image over http in rounded / Default(rect) shape.
	* Provides fadeIn animation by default
	* You can give you custom Animation object for displaying Image in Imageview.
	* You can give Default Image which is displayed before loading from web.
	
## So , Here are the guidelines. ##
	
1) Get Imagino jar from provided sample.
	
2) put it in your libs folder.
	
3)Give these permissions in menifest.
	
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    
Now you are done to use Imagino.
===============================

## Code Snippets ##
````
Imagino.setImageFromWeb(yourActivity.getApplicationContext(), yourImageView, "URL" , R.drawable.default_image , R.drawable.error_image , boolean_required_round , custom_Animation_object);
````
````
Imagino..doRoundImage(yourImageView);
````

## Usage Guidelines ##
If you don't want to use some default image then put ````-1```` as fourth parameter.

If you don't want to use some error image then put ````-1```` as fifth parameter.

If you don't want any Animation then pass ````new Animation(){}```` as your last parameter.

If you want fadeIn Animation then pass ````null```` as your last parameter.

## Special Thanx ##
Android hive classes for Image Loading over http.
