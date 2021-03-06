# DBFlowManager-Hyperion-Plugin
The Hyperion plugin of DBFlowManager for viewing DBFlow databases in the app.

<img src="https://github.com/wajahatkarim3/DBFlowManager-Hyperion-Plugin/raw/master/Art/demo.gif" data-canonical-src="https://github.com/wajahatkarim3/DBFlowManager-Hyperion-Plugin/raw/master/Art/demo.gif" width="300" />

Installation
============

First, follow the README to set up [DBFlow](https://github.com/Raizlabs/DBFlow). Then, follow the README to set up [Hyperion](https://github.com/willowtreeapps/Hyperion-Android). Then, all you need to do is simply add the dependency of DBFlowManager Hyperion Plugin and DBFlowManager like this in app's ```build.gradle``` file:

```groovy
dependencies {
  // DBFlow Manager
  implementation 'com.wajahatkarim3.DBFlowManager:DBFlowManager:3.1.1-v1'
  
  // DBFLow Manager Hyperion Plugin
  debugImplementation 'com.wajahatkarim3.dbflowmanager-hyperion-library:dbflowmanager-hyperion-library:1.0.4'
  releaseImplementation 'com.wajahatkarim3.dbflowmanager-hyperion-library:dbflowmanager-hyperion-library-no-op:1.0.4'
}
```

Or add as a new dependency inside your pom.xml

```xml
<dependency>
  <groupId>com.wajahatkarim3.DBFlowManager</groupId>
  <artifactId>DBFlowManager</artifactId>
  <version>3.1.1-v1</version>
  <type>pom</type>
</dependency>

<dependency>
  <groupId>com.wajahatkarim3.dbflowmanager-hyperion-library</groupId>
  <artifactId>dbflowmanager-hyperion-library</artifactId>
  <version>1.0.4</version>
  <type>pom</type>
</dependency>

<dependency>
  <groupId>com.wajahatkarim3.dbflowmanager-hyperion-library</groupId>
  <artifactId>dbflowmanager-hyperion-library-no-op</artifactId>
  <version1.0.4</version>
  <type>pom</type>
</dependency>
```

Usage
=====

Although, Hyperion will find the plugin automatically and add it to the list when you open the Hyperion drawer (as shown in the demo GIF above), but you need it tell the library about your database class. You can do it in your ```Application``` file after the DBFlow configuration is set like this:

```java
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // DBFLow Configuration
        FlowManager.init(new FlowConfig.Builder(this).build());
        
        // ....
        // Other configs like Retrofit, Dagger modules, Picasso, etc.
        // ....
        
        // Hyperion DBFlowManager Plugin Setup
        DBFlowManager_Hyperion_Constants.setDatabaseName(getApplicationContext(), YOUR_APP_DB_FILE.class);
    }
}

```

Troubleshooting
=====
If you get any crash about calling ```FlowManager.init()``` like [this issue](https://github.com/Raizlabs/DBFlow/issues/1300), then refer to [this solution](https://github.com/wajahatkarim3/DBFlowManager-Hyperion-Plugin/issues/3). 

The key point here is that if you use kotlin for databases and tables, then use ```kapt``` for DBFlow annotation processings.

Libraries Used
=============
* DBFlowManager [https://github.com/wajahatkarim3/DBFlowManager](https://github.com/wajahatkarim3/DBFlowManager)
* DBFlow [https://github.com/Raizlabs/DBFlow](https://github.com/Raizlabs/DBFlow)
* Hyperion [https://github.com/willowtreeapps/Hyperion-Android](https://github.com/willowtreeapps/Hyperion-Android)

Donations
=============

This project needs you! If you would like to support this project's further development, the creator of this project or the continuous maintenance of this project, feel free to donate. Your donation is highly appreciated (and I love food, coffee and beer). Thank you!

**PayPal**

* **[Donate $5](https://www.paypal.me/WajahatKarim/5)**: Thank's for creating this project, here's a tea (or some juice) for you!
* **[Donate $10](https://www.paypal.me/WajahatKarim/10)**: Wow, I am stunned. Let me take you to the movies!
* **[Donate $15](https://www.paypal.me/WajahatKarim/15)**: I really appreciate your work, let's grab some lunch!
* **[Donate $25](https://www.paypal.me/WajahatKarim/25)**: That's some awesome stuff you did right there, dinner is on me!
* **[Donate $50](https://www.paypal.me/WajahatKarim/50)**: I really really want to support this project, great job!
* **[Donate $100](https://www.paypal.me/WajahatKarim/100)**: You are the man! This project saved me hours (if not days) of struggle and hard work, simply awesome!
* **[Donate $2799](https://www.paypal.me/WajahatKarim/2799)**: Go buddy, buy Macbook Pro for yourself!

Of course, you can also choose what you want to donate, all donations are awesome!

Developed By
============
```
Wajahat Karim
```
- Website (http://wajahatkarim.com)
- Twitter (http://twitter.com/wajahatkarim)
- Medium (http://www.medium.com/@wajahatkarim3)
- LinkedIn (http://www.linkedin.com/in/wajahatkarim)


# How to Contribute
1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create new Pull Request

# License

    Copyright 2018 Wajahat Karim

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
