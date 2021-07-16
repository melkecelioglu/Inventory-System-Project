# Inventory-System-Project
 
 1. Summary
“Inventory Management and Tracking System” is a Java Swing Programme that aims a company’s personnel’s to track, get and edit the details about the company’s products. It is a simple and easy to use system which is available for authorized personnels so that everybody can not reach the company’s informations. The system contains the receipts and a lot more details about the products.
2. Project topic
Inventory management system can use to manage sales, stock, payments. Further, here include so many features with java modern GUI.
Starting Frame is LogIn. First, User has to login the system. After logged in succesfully, Home page Will open. There are 8 different option (included Home page) for different aims.
AddItem option helps user to add, delete and update.Stock page allows user to check stock datas which display on jTable. When click on the jTable cell database data retrieve to interface field. And the user can filter stock using the item name.
On the Sell page user can sell items using item code. When user type item code the data retrieved from the database also the user can insert quantity and sell. When selling the items, this system automatically generates an invoice. Then the user can print this invoice. Report page has some features like searching for dates and categories. Advanced Setting has a lisence text Area which user can search for words and also check if the internet connection is avaliable or not and a pie chart. Last page Bored aims user to have fun. There is a game, listenin music part and a color Chooser area.
The technologies used in inventory management system project
• Java: All codes have been written using the java programming language. • MySql: MySql has used as a database for this project.
• Apache: This project has developed inside of the Apache.
The goals of providing this project:
• Check the product status
• Control the system
 
 3. Project Workflow Chart
   Description Of The Study
          1. Literature Review 2. P r e l i m i n a r y
research
         2.Determination of the Project Needs
          3.Subunit Designs 4.Start of project design/drawing
          5.Theoretical Analysis
6.Coding and testing process
          7.Creating and connecting a database
          8.Simulation integration, Testing and Validation
          9.Starting report writing/checking the requirements that project has to have
    10.Performing Tests, Product Commercialization
7-9
10-12
13-15
16-18
19-21
22-24
25-27
28-30
31-02
3-5
      May 7-June 6
                         
 4. Project Design
Product Part Tracking System has 14 frames, 7 class also consists these components:
o Panel, Tabbed Pane, Splite Pane, Scroll Pane, Tool bar, Internal Frames o Combo box, check box, radio button, JSpinner
o jTable and Jlist
o Menus (Menu bar, Menu Item, Menu, Menu item check box, Separator) o Color chooser, File Chooser, JOptionPane
o Regular Expressions (Regex)
o A database with at least two tables
o Insert, Delete, Select, Update SQL cammands o 14 frames, 7 class.
o One login frame.
o Graphics
• On Advanced Settings page, I used Menu, Menubar, Menu items, scrollpane and textarea.
• AddItem Internalframe contains scrollpane, table combobox.
• Bored has a splitpane, buttons and checkbox
• ColorFun has buttongroup for radiobuttons, tabbedpanes, slider, spinner, scrollpane and list.
• Home page has a scrollbar, desktopPane
• Login page’ s panel is kGradientpanel also buttons are kgradient button
• Like Login page, Report page,SignUp page and SendCode page has kGradientpanel, passwordfield also kgradient button
• Report page has a scrollpane, datechooser.
• Also almost every Frame has panels, labels and textfields.
 
 5. Project Outputs and Success Criteria
Login page
The user can log in to the system using an already created password. Further, the user can recover his password and using signup button user can sign up and create a new account. Forgot password system that sends a code to user’s mail and verifies user’s new password.
   If the user forgot password, when mouseclicked on label, the e-mail verification screen opens and send a mail so that user can set a new password, username or e-mail.
  
 Home Page
In home page display organization details and menu item of the inventory management/control system. There is an alert text that moves also, changing images about the products.
  Add Item page
Using this section user can add update delete items. Further, there are facilities to store items images in the database. And also user can retrieve already added data from database and update any time.
 
 Stock page
Here user can check stock those stock data display on jTable. When click on the jTable cell database data retrieve to interface field. And the user can filter stock using the item name.
Sell Page
Here user can sell items using item code. when type item code the data retrieved from the database. Then the user can insert quantity and sell. When selling the items, this system automatically generates an invoice. Then the user can print this invoice.
 
 Report Page
Here include facilities to generate and print reports using different filtering options.
• In here used jasper report/ i-report to create the report.
• In this inventory project, the user can print the report using jasper report.
  Settings Page
For and kind of account issues or problems user can use this option. This option directly connected to LogIn page.

 Bored Page
 That page aims user’s to have fun. There are 3 choices such as listenin a music, playing a PingPong Game for 2 person or choose a color from multiple ways.
     
 Advanced Settings Page
This page contains the lisence of the company (I used Oracle’s Lisence ). The user can search a word or character. Also on the MenuBar, user can check the time and date. To check the Internet Connection, ⌘+U so that a dynamic button Will pop-up and inform about the internet status. Under that menu item, there is an option named Pie Chart Statistics. It she the percentage of the categories on my stocks.
    
 6. Things Done During the Project
First of all I draw an outline of the project. I’ve written the components I will be needded. I though a lot on how to make my project easy to use also effective.I started my project by designing the JFrames. After adding tables, labels, JTextFileds, and a lot more components. I made my project design as undecorated, I created my own closing option by clicking on an image. For Swing Components that does not exist on my Swing Control Panel, I added JAR libraries and import them (For instance jCalendar, GradientPanels also to Connect mysql connector).
After designing, I created MySQL database tables, variables and connected it to the project. Then I tried to SELECT, UPDATE, DELETE and INSERT my datas. That part was a bit compelling for me, I often got SQL Syntax Error. Because of my Home panel has not changed, I just change the main part, I used InternalFrames. I also learned how to create my own jar library.
I wanted to change the password part as sending SMS, not e-mail. But I searched on the internet and the way of sending OTP Messages is to use textlocal.co.uk I am not located in UK right now, that is why I could not even Subscribe to the system. I Verified the new password by sending E-mails.
7. Annotations
Initially, I have learned thanks to this project. Inventory Managements system project strengthen my knowledge, pratic and speed on Java, Swing and GUI. I had a lot fun especially Coding on PingPong and Graphics part. I had struggled a lot on Database Connection, Inserting, Updating and adding part. I have realised that struggling, taking a lot of errors expands my knowledge and helps me to master the subject. I learned how to control MySQL workbench, experienced improving coding games, graphics, image silde shows and a lot more exciting Applications on Netbeans, Apache. This project expanded my horizon on coding in Java. I realised that I can do a lot things with Java!
  
8. References
• YouTube *
• StackOverFlow* • Java Tutorials ** • GitHub ***
* Whenever I had errors or stuck on my code, first of all I tried to detect the problem, I tried out to solve the problem on my own, if I could not solve it after approximately 20 minutes, I took a look at StackOverFlow, If I still could not solve the problem, then I got some help from YouTube.
** In my Point of View Java Tutorial is the best Tutorial for Java. I read it whenever I feel not ready to code a project or challenge on a subject.
*** At the beginning of the project, On the first two stage (Literature Review and Preliminary research process) I’ve searched for project that are online. I got some idea About the project thank to them.
     
