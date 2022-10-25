package the_final_art;

/**
 * Write a description of class comiccon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.io.*;
public class comiccon
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);  
    static comiccon ob=new comiccon();
    static int con;static String b;static String a;
    static int k=0,gg,gd,sc=0,i,j;
    static int gf1,gf2,gf3,gf4,gf5,gf6,gf7,gf8,gf9,gf10,gf11,gf12;
    static String cart[]=new String[5000000];
    static String scoreboard[]=new String[5000000];
    static String l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    static String l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    static String l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
    static String l31,l32,l33,l34,l35,l36,l37,l38,l39,l40;
    static String l41,l42,l43,l44,l45,l46,l47,l48,l49,l50;
    comiccon()
    {
        l1="Batman Volume 1";
        l2="Batman Volume 2";
        l3="Batman Volume 3";
        l4="Batman Volume 4";
        l5="Batman Volume 5";
        l6="Superman Volume 6";
        l7="Superman Volume 7";
        l8="Superman Volume 8";
        l9="Superman Volume 9";
        l10="Superman Volume 10";
        l11="Spiderman Volume 25";
        l12="Spiderman Volume 26";
        l13="Spiderman Volume 27";
        l14="Spiderman Volume 28";
        l15="Spiderman Volume 29";
        l16="Iron Man Volume 49";
        l17="Iron Man Volume 50";
        l18="Iron Man Volume 51";
        l19="Iron Man Volume 52";
        l20="Iron Man Volume 53";
        l21="The Avengers Volume 12";
        l22="The Avengers Volume 13";
        l23="The Avengers Volume 14";
        l24="The Avengers Volume 15";
        l25="The Avengers Volume 16";
        l26="One Piece Volume 53";
        l27="One Piece Volume 54";
        l28="One Piece Volume 55";
        l29="One Piece Volume 56";
        l30="One Piece Volume 57";
        l31="Fullmetal Alchemist Volume 11";
        l32="Fullmetal Alchemist Volume 12";
        l33="Fullmetal Alchemist Volume 13";
        l34="Fullmetal Alchemist Volume 14";
        l35="Fullmetal Alchemist Volume 15";
        l36="Naruto Volume 66";
        l37="Naruto Volume 67";
        l38="Naruto Volume 68";
        l39="Naruto Volume 69";
        l40="Naruto Volume 70";
        l41="Hunter x Hunter Volume 41";
        l42="Hunter x Hunter Volume 42";
        l43="Hunter x Hunter Volume 43";
        l44="Hunter x Hunter Volume 44";
        l45="Hunter x Hunter Volume 45";
        l46="Death Note Volume 12";
        l47="Death Note Volume 13";
        l48="Death Note Volume 14";
        l49="Death Note Volume 15";
        l50="Death Note Volume 16";
        gf1=0;
        gf2=0;
        gf3=0;
        gf4=0;
        gf5=0;
        gf6=0;
        gf7=0;
        gf8=0;
        gf9=0;
        gf10=0;
        gf11=0;
        gf12=0;
        gg=0;
        gd=0;
        con=1000;
    }

    public static void main()throws IOException
    {
        System.out.println("\u000c");        
        System.out.println("Welcome to ComicCon 2016");
        System.out.println("We are delighted to have you here");
        System.out.println("To be here, you need a nickname though");
        System.out.println("So, write your nickname (it can be anything)");
        a=in.readLine();
        ob.explain();
    }

    void explain()throws IOException
    {
        System.out.println("\u000c");        
        System.out.println("Welcome to ComicCon 2016 "+a);
        System.out.println("You can either solve quizzes or go shopping for the latest comics here");
        System.out.println("Let me explain how everything works");
        System.out.println("On solving quizzes, you get Conpoints");
        System.out.println("The no. of Conpoints awarded depends upon the difficulty of the level");
        System.out.println("Losing gets you none");
        System.out.println("You can use these conpoints at the store...");
        System.out.println("...where you can buy the latest volumes of your favourite comic books");
        System.out.println("Also, any input you make must be followed by 'Enter'");
        System.out.println("Is that understood?");
        System.out.println("Press Enter to Continue");
        String a1=in.readLine();
        if(gg==0)
        {
            System.out.println("\u000c");
            System.out.println("Well then, welcome to ComicCon 2016!");
            System.out.println("Here are 1000 Conpoints to start you off");
            System.out.println("Press Enter to Continue");
            a1=in.readLine();
        }
        ob.mainchoice();
    }

    void mainchoice()throws IOException
    {
        while(true)
        {
            gg=1;            
            System.out.println("\u000c");
            System.out.println(a);
            System.out.println("You have "+con+" conpoints");
            System.out.println("Press the letter corresponding to the function to start it");
            System.out.println("a=Solve Quizzes");
            System.out.println("b=Buy Comics");
            System.out.println("c=Cart"); 
            System.out.println("d=Quiz Record");
            System.out.println("e=Read instructions");      
            System.out.println("f=Exit(boo!)");
            System.out.println();
            System.out.println("Press the corresponding letter followed by Enter to continue");
            b=in.readLine();
            if(b.equalsIgnoreCase("a"))
            {
                if(gd==0)
                    ob.playexplain();
                else
                    ob.play();
            }
            else if(b.equalsIgnoreCase("b"))
                ob.shop();
            else if(b.equalsIgnoreCase("c"))
                ob.cart();  
            else if(b.equalsIgnoreCase("d"))
                ob.quizrecord();
            else if(b.equalsIgnoreCase("e"))
                ob.explain();        
            else if(b.equalsIgnoreCase("f"))
                ob.exit();

            else
            {
                System.out.println("Wrong input");
                System.out.println("Press Enter to Continue");
                String a1=in.readLine();
                continue;
            }
            break;
        }
    }

    void playexplain()throws IOException
    {
        System.out.println("\u000c");
        System.out.println("Yo! Welcome to the Quiz Zone!!!");
        System.out.println("I'll go through the rules");
        System.out.println("We have a multiple selection of quizzes here");

        System.out.println("Winning gets you a set no. of conpoints");
        System.out.println("Losing gets you none");
        System.out.println("The no. of conpoints you get depend upon the difficulty of the game");
        System.out.println("Which you'll have to find out");
        System.out.println("Also, if you're in the middle of the game,");
        System.out.println("Typing the wrong answer will bring you back to the list (and it will be considered as a loss)");
        System.out.println("And wrong inputs will cause the game to restart or go back to the list as per your choice (no loss considered)");
        System.out.println("Last rule,");
        System.out.println("You can't play the same game twice in a row");
        System.out.println("Press Enter to continue");
        String papa=in.readLine();
        ob.play();
    }    

    void play()throws IOException
    {
        String qq;;gd=1;
        while(true)        
        {
            System.out.println("\u000c");
            System.out.println("Here are the list of games we have");
            System.out.println();
            System.out.println("Game 1");
            System.out.println("Who Said This");
            System.out.println();
            System.out.println("Game 2");
            System.out.println("Kaun Banega Crorepati");
            System.out.println();
            System.out.println("Game 3");
            System.out.println("Name the dude who...");
            System.out.println();
            System.out.println("Game 4");
            System.out.println("The Lord of the Riddles");
            System.out.println();
            System.out.println("Game 5");
            System.out.println("The Return of the Riddles");
            System.out.println();
            System.out.println("Game 6");
            System.out.println("Trivial Questions - Part 1 Personalities");
            System.out.println();
            System.out.println("Game 7");
            System.out.println("Trivial Questions - Part 2 Science and Technology");
            System.out.println();
            System.out.println("Game 8");
            System.out.println("Trivial Questions - Part 3 The World and Beyond");
            System.out.println();
            System.out.println("Game 9");
            System.out.println("Compu-tech's");
            System.out.println();
            System.out.println("Game 10");
            System.out.println("Cheryl's Birthday");
            System.out.println();
            System.out.println("Game 11");
            System.out.println("The Comic and Manga Quiz");
            System.out.println();
            System.out.println("Game 12");
            System.out.println("Video Games and Movies");
            System.out.println();
            System.out.println("e=Exit");
            System.out.println("r=Read Playzone Instructions");
            System.out.println();
            System.out.println("Select the game you want to play");
            String p=in.readLine();
            if(p.equalsIgnoreCase("e"))
            {
                ob.mainchoice();
                break;
            }
            else if(p.equalsIgnoreCase("r"))
            {
                ob.playexplain();
                break;
            }
            else if(p.equalsIgnoreCase("1"))
            {
                if(gf1==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println();
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game1();

            }
            else if(p.equalsIgnoreCase("2"))
            {
                if(gf2==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game2();
            }
            else if(p.equalsIgnoreCase("3"))
            {
                if(gf3==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game3();
            }
            else if(p.equalsIgnoreCase("4"))
            {
                if(gf4==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game4();
            }
            else if(p.equalsIgnoreCase("5"))
            {
                if(gf5==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game5();
            }
            else if(p.equalsIgnoreCase("6"))
            {
                if(gf6==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game6();
            }
            else if(p.equalsIgnoreCase("7"))
            {
                if(gf7==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game7();
            }
            else if(p.equalsIgnoreCase("8"))
            {
                if(gf8==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game8();
            }
            else if(p.equalsIgnoreCase("9"))
            {
                if(gf9==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game9();
            }
            else if(p.equalsIgnoreCase("10"))
            {
                if(gf10==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game10();
            }
            else if(p.equalsIgnoreCase("11"))
            {
                if(gf11==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game11();
            }
            else if(p.equalsIgnoreCase("12"))
            {
                if(gf12==1)
                {
                    System.out.println("You can't play a game two times in a row");
                    System.out.println("Choose another game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    continue;
                }
                ob.game12();
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                continue;
            }
            break;
        }
    }

    void shop()throws IOException
    {
        int cost;String qq;String a3;String a2;

        while(true)
        {

            System.out.println("\u000c"); 
            System.out.println("Welcome to the shop");
            System.out.println("You can buy the latest comics in here");
            System.out.println("You have "+con+" conpoints");
            System.out.println("We have:");
            System.out.println("a=Batman");
            System.out.println("b=Superman");
            System.out.println("c=Spiderman");
            System.out.println("d=Iron Man");
            System.out.println("e=The Avengers");
            System.out.println("f=One Piece");
            System.out.println("g=Fullmetal Alchemist");
            System.out.println("h=Naruto");
            System.out.println("i=Hunter x Hunter");
            System.out.println("j=Death Note");
            System.out.println();
            System.out.println("k=Exit");
            if(con==0)
                {   
                    System.out.println("By the way, you have no money, just saying");
                    
                } 
            String b1=in.readLine();
             switch(b1)
            {

                case "a":
                cost=250;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l1+":-Chapter 1-10     "+cost);
                System.out.println(l2+":-Chapter 10-20    "+cost); 
                System.out.println(l3+":-Chapter 20-30    "+cost); 
                System.out.println(l4+":-Chapter 30-40    "+cost); 
                System.out.println(l5+":-Chapter 40-50    "+cost);
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                
                a2=in.readLine();
                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("1"))
                            cart[i]=l1;
                        else if(a2.equalsIgnoreCase("2"))
                            cart[i]=l2;
                        else if(a2.equalsIgnoreCase("3"))
                            cart[i]=l3;
                        else if(a2.equalsIgnoreCase("4"))
                            cart[i]=l4;
                        else if(a2.equalsIgnoreCase("5"))
                            cart[i]=l5;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "b":
                cost=125;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l6+":-Chapter 60-75 "+cost);
                System.out.println(l7+":-Chapter 76-90 "+cost);
                System.out.println(l8+":-Chapter 61-105 "+cost); 
                System.out.println(l9+":-Chapter 106-120 "+cost); 
                System.out.println(l10+":-Chapter 121-125 "+cost); 
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                           

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("6"))
                            cart[i]=l6;
                        else if(a2.equalsIgnoreCase("7"))
                            cart[i]=l7;
                        else if(a2.equalsIgnoreCase("8"))
                            cart[i]=l8;
                        else if(a2.equalsIgnoreCase("9"))
                            cart[i]=l9;
                        else if(a2.equalsIgnoreCase("10"))
                            cart[i]=l10;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "c":
                cost=450;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l11+":-Chapter 11-15 "+cost);
                System.out.println(l12+":-Chapter 16-20 "+cost); 
                System.out.println(l13+":-Chapter 21-25 "+cost);
                System.out.println(l14+":-Chapter 26-30 "+cost);
                System.out.println(l15+":-Chapter 31-35 "+cost); 
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                              

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("25"))
                            cart[i]=l11;
                        else if(a2.equalsIgnoreCase("26"))
                            cart[i]=l12;
                        else if(a2.equalsIgnoreCase("27"))
                            cart[i]=l13;
                        else if(a2.equalsIgnoreCase("28"))
                            cart[i]=l14;
                        else if(a2.equalsIgnoreCase("29"))
                            cart[i]=l15;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "d":
                cost=50;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l16+":-Chapter 234-241     "+cost);
                System.out.println(l17+":-Chapter 242-249     "+cost);
                System.out.println(l18+":-Chapter 250-257     "+cost);
                System.out.println(l19+":-Chapter 258-265     "+cost);
                System.out.println(l20+":-Chapter 266-273     "+cost);
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                              

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("49"))
                            cart[i]=l16;
                        else if(a2.equalsIgnoreCase("50"))
                            cart[i]=l17;
                        else if(a2.equalsIgnoreCase("51"))
                            cart[i]=l18;
                        else if(a2.equalsIgnoreCase("52"))
                            cart[i]=l19;
                        else if(a2.equalsIgnoreCase("53"))
                            cart[i]=l20;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "e":
                cost=175;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l21+":-Chapter 34-41     "+cost);
                System.out.println(l22+":-Chapter 42-49     "+cost); 
                System.out.println(l23+":-Chapter 50-57     "+cost);
                System.out.println(l24+":-Chapter 58-65     "+cost);
                System.out.println(l25+":-Chapter 66-73     "+cost);
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                           

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("12"))
                            cart[i]=l21;
                        else if(a2.equalsIgnoreCase("13"))
                            cart[i]=l22;
                        else if(a2.equalsIgnoreCase("14"))
                            cart[i]=l23;
                        else if(a2.equalsIgnoreCase("15"))
                            cart[i]=l24;
                        else if(a2.equalsIgnoreCase("16"))
                            cart[i]=l25;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "f":
                cost=650;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l26+":-Chapter 535-542     "+cost);
                System.out.println(l27+":-Chapter 543-550     "+cost); 
                System.out.println(l28+":-Chapter 551-558     "+cost); 
                System.out.println(l29+":-Chapter 559-566     "+cost);
                System.out.println(l30+":-Chapter 567-574     "+cost);
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                              

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("53"))
                            cart[i]=l26;
                        else if(a2.equalsIgnoreCase("54"))
                            cart[i]=l27;
                        else if(a2.equalsIgnoreCase("55"))
                            cart[i]=l28;
                        else if(a2.equalsIgnoreCase("56"))
                            cart[i]=l29;
                        else if(a2.equalsIgnoreCase("57"))
                            cart[i]=l30;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "g":
                cost=675;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l31+":-Chapter 105-111     "+cost);
                System.out.println(l32+":-Chapter 112-118     "+cost); 
                System.out.println(l33+":-Chapter 119-125     "+cost); 
                System.out.println(l34+":-Chapter 126-132     "+cost); 
                System.out.println(l35+":-Chapter 133-139     "+cost); 
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                           

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("11"))
                            cart[i]=l31;
                        else if(a2.equalsIgnoreCase("12"))
                            cart[i]=l32;
                        else if(a2.equalsIgnoreCase("13"))
                            cart[i]=l33;
                        else if(a2.equalsIgnoreCase("14"))
                            cart[i]=l34;
                        else if(a2.equalsIgnoreCase("15"))
                            cart[i]=l35;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "h":
                cost=500;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l36+":-Chapter 651-660     "+cost);
                System.out.println(l37+":-Chapter 661-670     "+cost);
                System.out.println(l38+":-Chapter 671-680     "+cost);
                System.out.println(l39+":-Chapter 681-690     "+cost);
                System.out.println(l40+":-Chapter 691-700     "+cost);
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                             

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("66"))
                            cart[i]=l36;
                        else if(a2.equalsIgnoreCase("67"))
                            cart[i]=l37;
                        else if(a2.equalsIgnoreCase("68"))
                            cart[i]=l38;
                        else if(a2.equalsIgnoreCase("69"))
                            cart[i]=l39;
                        else if(a2.equalsIgnoreCase("70"))
                            cart[i]=l40;
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;                    
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "i":
                cost=800;
                System.out.println("\u000c");
                System.out.println("Choose which volume you want");
                System.out.println(l41+":-Chapter 299-308     "+cost);
                System.out.println(l42+":-Chapter 309-318     "+cost); 
                System.out.println(l43+":-Chapter 319-328     "+cost); 
                System.out.println(l44+":-Chapter 329-338     "+cost); 
                System.out.println(l45+":-Chapter 339-348     "+cost); 
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                              

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("41"))
                        {
                            cart[i]=l41;

                        }
                        else if(a2.equalsIgnoreCase("42"))
                        {
                            cart[i]=l42;

                        }
                        else if(a2.equalsIgnoreCase("43"))
                        {
                            cart[i]=l43;

                        }
                        else if(a2.equalsIgnoreCase("44"))
                        {
                            cart[i]=l44;

                        }
                        else if(a2.equalsIgnoreCase("45"))
                        {
                            cart[i]=l45;

                        }
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;
                    System.out.println();
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }

                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();
                break;

                case "j":
                cost=700;
                System.out.println("\u000c");
                System.out.println();   
                System.out.println("\u000c");   
                System.out.println("Choose which volume you want");
                System.out.println(l46+":-Chapter 79-84     "+cost);
                System.out.println(l47+":-Chapter 85-90     "+cost); 
                System.out.println(l48+":-Chapter 91-96     "+cost); 
                System.out.println(l49+":-Chapter 97-102    "+cost); 
                System.out.println(l50+":-Chapter 103-108   "+cost); 
                System.out.println();
                System.out.println("Type the volume. no to buy the volume");
                a2=in.readLine();
                              

                con=con-cost;

                if(con>=0)
                {

                    System.out.println("Thanks for buying");
                    System.out.println("You now have "+con+"conpoints");
                    for(int i=k;i<k+1;i++)
                    {
                        if(a2.equalsIgnoreCase("12"))
                        {
                            cart[i]=l46;

                        }
                        else if(a2.equalsIgnoreCase("13"))
                        {
                            cart[i]=l47;

                        }
                        else if(a2.equalsIgnoreCase("14"))
                        {
                            cart[i]=l48;

                        }
                        else if(a2.equalsIgnoreCase("15"))
                        {
                            cart[i]=l49;

                        }
                        else if(a2.equalsIgnoreCase("16"))
                        {
                            cart[i]=l50;

                        }
                        else
                        {
                            System.out.println();                            
                            System.out.println("Wait a second, we don't have that!");
                            System.out.println("Either that, or you've input incorrectly");
                            System.out.println("Restoring conpoints to normal");
                            con=con+cost;
                            System.out.println("You are back to "+con+" conpoints");
                            k--;
                        }
                    }
                    k++;
                    System.out.println();
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                if(con<0)
                {   
                    con=con+cost;
                    System.out.println("Not enough money");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                }
                System.out.println("\u000c");
                System.out.println("What do you want to do now?");
                System.out.println("1=Continue Shopping");
                System.out.println("Enter=Back to main screen");
                a3=in.readLine();
                if(a3.equalsIgnoreCase("1"))
                    continue;                

                else

                    ob.mainchoice();

                break;

                case "k":
                ob.mainchoice();
                break;

                default:
                System.out.println("Enter again");
                continue;

            }
            break;
        }
    }

    void cart()throws IOException
    {
        System.out.println("\u000c"); 
        if(k<=0) 
            System.out.println("You have nothing");
        else        
        {    
            System.out.println("You have purchased:-");
            System.out.println();
            for(i=0;i<k;i++)
                System.out.println(cart[i]);
        }
        System.out.println();
        System.out.println("Press Enter to Continue");
        String a0=in.readLine();
        ob.mainchoice();
    }

    void game1()throws IOException
    {
        String qq,next,ans1;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("In this quiz, we'll be giving you a quote");
            System.out.println("And you have to guess who said it");
            System.out.println("Lets begin! {Press Enter to Continue}");    
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("You must be the change you want to see in the world");
            System.out.println("a=Mahatma Gandhi");
            System.out.println("b=Joan of Arc");
            System.out.println("c=Gautam Buddha");
            System.out.println("d=Jesus Christ");
            ans1=in.readLine();
            if(ans1.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong answer");

                scoreboard[sc]="Game 1 - Who Said This     Lost";
                sc++;

                System.out.println("Press Enter to Continue");
                gf1=1;
                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                qq=in.readLine();
                ob.play();
                break;
            }
            else if(ans1.equalsIgnoreCase("b"))
            {
                System.out.println("Wrong answer");

                scoreboard[sc]="Game 1 - Who Said This     Lost";
                sc++;

                gf1=1;
                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans1.equalsIgnoreCase("d"))
            {
                System.out.println("Wrong answer");

                scoreboard[sc]="Game 1 - Who Said This     Lost";
                sc++;

                gf1=1;
                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans1.equalsIgnoreCase("a"))
            {
                System.out.println("Correct answer");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("Courage is not the absence of fear, but rather the judgement that something else is more important than fear.");
                System.out.println("a=Wayne Gretzky");
                System.out.println("b=Oz Mandino");
                System.out.println("c=Ambrose Redmoon");
                System.out.println("d=Norman Vincent Peale");   
                ans1=in.readLine();
                if(ans1.equalsIgnoreCase("a"))
                {
                    System.out.println("Wrong answer");

                    scoreboard[sc]="Game 1 - Who Said This     Lost";
                    sc++;

                    System.out.println("Press Enter to Continue");
                    gf1=1;
                    gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans1.equalsIgnoreCase("b"))
                {
                    System.out.println("Wrong answer");

                    scoreboard[sc]="Game 1 - Who Said This     Lost";
                    sc++;

                    System.out.println("Press Enter to Continue");
                    gf1=1;
                    gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans1.equalsIgnoreCase("d"))
                {
                    System.out.println("Wrong answer");

                    scoreboard[sc]="Game 1 - Who Said This     Lost";
                    sc++;

                    gf1=1;
                    gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans1.equalsIgnoreCase("c"))
                {
                    System.out.println("Correct answer");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("When hungry, eat your rice; when tired, close your eyes. Fools may laugh at me, but wise men will know what I mean.");
                    System.out.println("a=Hayao Miyazaki");
                    System.out.println("b=Lin-Chi");
                    System.out.println("c=Yao Ming");
                    System.out.println("d=An Wang");
                    ans1=in.readLine();
                    if(ans1.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong answer");

                        scoreboard[sc]="Game 1 - Who Said This     Lost";
                        sc++;

                        gf1=1;
                        gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans1.equalsIgnoreCase("c"))
                    {
                        System.out.println("Wrong answer");

                        scoreboard[sc]="Game 1 - Who Said This     Lost";
                        sc++;

                        gf1=1;
                        gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans1.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");

                        scoreboard[sc]="Game 1 - Who Said This     Lost";
                        sc++;

                        gf1=1;
                        gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans1.equalsIgnoreCase("b"))
                    {
                        System.out.println("Correct answer");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("The real voyage of discovery consists not in seeking new lands but seeing with new eyes.");
                        System.out.println("a=Marcel Proust");
                        System.out.println("b=Lao-Tze");
                        System.out.println("c=John Ruskin");
                        System.out.println("d=Will Rogers");
                        ans1=in.readLine();
                        if(ans1.equalsIgnoreCase("b"))
                        {
                            System.out.println("Wrong answer");

                            scoreboard[sc]="Game 1 - Who Said This     Lost";
                            sc++;

                            gf1=1;
                            gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans1.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");

                            scoreboard[sc]="Game 1 - Who Said This     Lost";
                            sc++;

                            gf1=1;
                            gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans1.equalsIgnoreCase("d"))
                        {
                            System.out.println("Wrong answer");

                            scoreboard[sc]="Game 1 - Who Said This     Lost";
                            sc++;

                            gf1=1;
                            gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans1.equalsIgnoreCase("a"))
                        {
                            System.out.println("Correct answer");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("Always forgive your enemies; nothing annoys them so much.");
                            System.out.println("a=Oscar Levant");
                            System.out.println("b=Oscar 1");
                            System.out.println("c=John Wilmot");
                            System.out.println("d=Oscar Wilde");
                            ans1=in.readLine();
                            if(ans1.equalsIgnoreCase("b"))
                            {
                                System.out.println("Wrong answer");

                                scoreboard[sc]="Game 1 - Who Said This     Lost";
                                sc++;

                                gf1=1;
                                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans1.equalsIgnoreCase("c"))
                            {
                                System.out.println("Wrong answer");

                                scoreboard[sc]="Game 1 - Who Said This     Lost";
                                sc++;

                                gf1=1;
                                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans1.equalsIgnoreCase("a"))
                            {
                                System.out.println("Wrong answer");

                                scoreboard[sc]="Game 1 - Who Said This     Lost";
                                sc++;

                                gf1=1;
                                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans1.equalsIgnoreCase("d"))
                            {
                                System.out.println("Correct answer");

                                scoreboard[sc]="Game 1 - Who Said This     Won";
                                sc++;
                                gf1=0;
                                gf2=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("That was the last question");
                                System.out.println("You win 1000 conpoints");
                                con=con+1000;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();       
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }         
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }          
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }           
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }     
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game2()throws IOException
    {
        String qq;String ans2;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Welcome to Kaun Banega Crorepati");
            System.out.println("Question 1");
            System.out.println("Finger is to hand as leaf is to...");
            System.out.println("a=Forest");
            System.out.println("b=Branch");
            System.out.println("c=Tree");
            System.out.println("d=Twig");
            ans2=in.readLine();
            if(ans2.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong!!!");

                scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                sc++;

                gf2=1;
                gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            if(ans2.equalsIgnoreCase("b"))    
            {
                System.out.println("Wrong!!!");
                scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                sc++;
                gf2=1;
                gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            if(ans2.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong!!!");
                scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                sc++;
                gf2=1;
                gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            if(ans2.equalsIgnoreCase("d"))
            {
                System.out.println("Correct Answer!!!");
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                System.out.println("\u000c");
                System.out.println("Question 2");
                System.out.println("'ENITLESHINECT' when unscrambled gives the name of a...");
                System.out.println("a=Country");
                System.out.println("b=Ocean");
                System.out.println("c=Plant");
                System.out.println("d=Movie");
                ans2=in.readLine();
                if(ans2.equalsIgnoreCase("a"))
                {

                    System.out.println("Correct Answer!!!");
                    System.out.println("Just in case you only guessed, the country's name was Liechtenstein");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    System.out.println("\u000c");
                    System.out.println("Question 3");
                    System.out.println("21,63,189,18,54,162....");
                    System.out.println("What comes next?");
                    System.out.println("a=16,32,96,6");
                    System.out.println("b=486,1458,4374");
                    System.out.println("c=9,27,81");
                    System.out.println("d=1,2,3");
                    ans2=in.readLine();
                    if(ans2.equalsIgnoreCase("c"))
                    {
                        System.out.println("Correct Answer!!!");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        System.out.println("\u000c");
                        System.out.println("Question 4");
                        System.out.println("Clouds are white");
                        System.out.println("Whiteboards are white");
                        System.out.println("Straws are white");
                        System.out.println("Eggs are white");
                        System.out.println("And milk is white");
                        System.out.println("What do cows drink?");
                        System.out.println("a=Milk");
                        System.out.println("b=Hay");
                        System.out.println("c=Eggs");
                        System.out.println("d=Water");
                        ans2=in.readLine();
                        if(ans2.equalsIgnoreCase("d"))
                        {
                            scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Won";
                            sc++;
                            gf2=0;
                            gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("You weren't fooled");
                            System.out.println("That was the correct answer");
                            System.out.println("This was the last question");
                            System.out.println("You have won 500 conpoints");
                            System.out.println("You were never going to become a crorepati");
                            con=con+500;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans2.equalsIgnoreCase("b"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                            sc++;
                            gf2=1;
                            gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("You lose all conpoints you earned in this game");
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans2.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                            sc++;
                            gf2=1;
                            gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("You lose all conpoints you earned in this game");
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans2.equalsIgnoreCase("a"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                            sc++;
                            gf2=1;
                            gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("You lose all conpoints you earned in this game");
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("You lose all conpoints you earned in this game");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            } 
                        }
                    }

                    else if(ans2.equalsIgnoreCase("b"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                        sc++;
                        gf2=1;
                        gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("You lose all conpoints you earned in this game");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans2.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                        sc++;
                        gf2=1;
                        gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("You lose all conpoints you earned in this game");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans2.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                        sc++;
                        gf2=1;
                        gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("You lose all conpoints you earned in this game");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("You lose all conpoints you earned in this game");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else if(ans2.equalsIgnoreCase("b"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                    sc++;
                    gf2=1;
                    gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("You lose all conpoints you earned in this game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans2.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                    sc++;
                    gf2=1;
                    gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("You lose all conpoints you earned in this game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans2.equalsIgnoreCase("d"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 2 - Kaun Banega Crorepati     Lost";
                    sc++;
                    gf2=1;
                    gf1=0;gf3=0;gf5=0;gf6=0;gf4=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("You lose all conpoints you earned in this game");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("You lose all conpoints you earned in this game");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("You lose all conpoints you earned in this game");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game3()throws IOException
    {
        String qq; String ans3;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("Name the dude who only won 7 Wimbledons");
            System.out.println("a=Roger Federer");
            System.out.println("b=Rafeal Nadal");
            System.out.println("c=William Renshaw");
            System.out.println("d=Pete Sampras");
            ans3=in.readLine();
            if(ans3.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                sc++;
                gf3=1;
                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans3.equalsIgnoreCase("b"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                sc++;
                gf3=1;
                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans3.equalsIgnoreCase("d"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                sc++;
                gf3=1;
                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans3.equalsIgnoreCase("c"))
            {
                System.out.println("Correct answer");
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                System.out.println("\u000c");
                System.out.println("Question 2");
                System.out.println("Name the dude who has won the most wins in WWE RAW");
                System.out.println("a=Batista");
                System.out.println("b=Triple H");
                System.out.println("c=Chris Jericho");
                System.out.println("d=Randy Orton");
                ans3=in.readLine();
                if(ans3.equalsIgnoreCase("a"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                    sc++;
                    gf3=1;
                    gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans3.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                    sc++;
                    gf3=1;
                    gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans3.equalsIgnoreCase("d"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                    sc++;
                    gf3=1;
                    gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans3.equalsIgnoreCase("b"))

                {
                    System.out.println("Correct answer");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    System.out.println("\u000c");
                    System.out.println("Question 3");
                    System.out.println("Name the dude who was the youngest player to get a Grandmaster title in Chess");
                    System.out.println("a=Parimarjan Negi");
                    System.out.println("b=Magnus Carlsen");
                    System.out.println("c=Sergey Karjakin");
                    System.out.println("d=Wei Yi");
                    ans3=in.readLine();
                    if(ans3.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                        sc++;
                        gf3=1;
                        gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans3.equalsIgnoreCase("b"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                        sc++;
                        gf3=1;
                        gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans3.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                        sc++;
                        gf3=1;
                        gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans3.equalsIgnoreCase("c"))
                    {
                        System.out.println("Correct answer");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        System.out.println("\u000c");
                        System.out.println("Question 4");
                        System.out.println("Name the dude who is the youngest person to climb Mount Everest");
                        System.out.println("a=Jordan Romero");
                        System.out.println("b=Malavath Purna");
                        System.out.println("c=Ming Kipa");
                        System.out.println("d=Temba Tsheri");
                        ans3=in.readLine();
                        if(ans3.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                            sc++;
                            gf3=1;
                            gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans3.equalsIgnoreCase("b"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                            sc++;
                            gf3=1;
                            gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans3.equalsIgnoreCase("d"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                            sc++;
                            gf3=1;
                            gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans3.equalsIgnoreCase("a"))
                        {
                            System.out.println("Correct answer");
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            System.out.println("\u000c");
                            System.out.println("Question 5");
                            System.out.println("Name the dude who holds the record for the winner of most consecutive men's titles in Squash");
                            System.out.println("a=Nicol David");
                            System.out.println("b=Jansher Khan");
                            System.out.println("c=Susan Devoy");
                            System.out.println("d=Geoff Hunt");
                            ans3=in.readLine();
                            if(ans3.equalsIgnoreCase("c"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                                sc++;
                                gf3=1;
                                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans3.equalsIgnoreCase("a"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                                sc++;
                                gf3=1;
                                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans3.equalsIgnoreCase("d"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 3 - Name the Dude Who     Lost";
                                sc++;
                                gf3=1;
                                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans3.equalsIgnoreCase("b"))
                            {
                                System.out.println("Correct answer");
                                scoreboard[sc]="Game 3 - Name the Dude Who     Won";
                                sc++;gf3=0;
                                gf1=0;gf2=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("You win 1500 conpoints");
                                con=con+1500;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }

                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press Enter to Continue");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game4()throws IOException
    {
        String next,qq;String ans4;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Now, in these riddles are of the guess the object type");
            System.out.println("The catch is, there are no choices. You have to type in the answer");
            System.out.println("And only the perfect answer will be accepted");
            System.out.println();
            System.out.println("For example, if the question is...");
            System.out.println("What is it that's always coming but never arrives?"); 
            System.out.println("The only answer that will be accepted is 'Tomorrow'. Not even 'Next Day'");
            System.out.println("Yeah, and the title is so because I've taken them from the guy who wrote ");
            System.out.println("                                                           'The Lord of the Rings'");
            System.out.println("So, lets begin!  {Press Enter to Continue}");
            next=in.readLine();

            System.out.println("\u000c");
            System.out.println("First question");
            System.out.println("Thirty two white horses on a red hill,");
            System.out.println("First they champ,");
            System.out.println("Then they stamp,");
            System.out.println("Then they stand still.");
            System.out.println();
            System.out.println("Hint:-Remember the explanation");
            System.out.println();
            System.out.println("What's the answer?");
            ans4=in.readLine();
            if(ans4.equalsIgnoreCase("Teeth")||ans4.equalsIgnoreCase("Tooth"))
            {
                System.out.println("\u000c");
                System.out.println("Correct answer!!!");
                System.out.println();
                System.out.println("Second question");
                System.out.println("Voiceless it cries,");
                System.out.println("Wingless flutters,");
                System.out.println("Toothless bites,");
                System.out.println("Mouthless mutters.");
                System.out.println();
                System.out.println("Hint:-Same as before");
                System.out.println();
                ans4=in.readLine();
                if(ans4.equalsIgnoreCase("Wind"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct answer!!!");
                    System.out.println();
                    System.out.println("Third question");
                    System.out.println("An eye in a blue face");
                    System.out.println("Saw an eye in a green face.");
                    System.out.println("“That eye is like to this eye”");
                    System.out.println("Said the first eye,");
                    System.out.println("“But in low place");
                    System.out.println("Not in high place.”");
                    System.out.println();
                    System.out.println("Hint:-Hint 2");
                    System.out.println();
                    ans4=in.readLine();
                    if(ans4.equalsIgnoreCase("Sun on the daisies"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct answer!!!");
                        System.out.println();
                        System.out.println("Final question");
                        System.out.println("It cannot be seen, cannot be felt,");
                        System.out.println("Cannot be heard, cannot be smelt.");
                        System.out.println("It lies behind stars and under hills,");
                        System.out.println("And empty holes it fills.");
                        System.out.println("It comes first and follows after,");
                        System.out.println("Ends life, kills laughter.");
                        System.out.println();
                        System.out.println("Hint:-I don't think I need to tell this one");
                        System.out.println();
                        ans4=in.readLine();
                        if(ans4.equalsIgnoreCase("Darkness")||ans4.equalsIgnoreCase("Dark"))
                        {
                            System.out.println("\u000c");
                            scoreboard[sc]="Game 4 - The Lord of the Riddles     Won";
                            sc++;gf4=0;
                            gf1=0;gf2=0;gf3=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Amazing!");
                            System.out.println("Hats off to you, sir (or mam)");
                            System.out.println("As a token of my appreciation - 3750 conpoints");
                            con=con+3750;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else
                        {
                            System.out.println("It doesn't matter what you wrote...");
                            scoreboard[sc]="Game 4 - The Lord of the Riddles     Lost";
                            sc++;
                            System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                            gf4=1;
                            gf1=0;gf2=0;gf3=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                    }
                    else
                    {
                        System.out.println("It doesn't matter what you wrote...");
                        scoreboard[sc]="Game 4 - The Lord of the Riddles     Lost";
                        sc++;
                        System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                        gf4=1;
                        gf1=0;gf2=0;gf3=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                }
                else
                {
                    System.out.println("It doesn't matter what you wrote...");
                    scoreboard[sc]="Game 4 - The Lord of the Riddles     Lost";
                    sc++;
                    System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                    gf4=1;
                    gf1=0;gf2=0;gf3=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
            }
            else
            {
                System.out.println("It doesn't matter what you wrote...");
                scoreboard[sc]="Game 4 - The Lord of the Riddles     Lost";
                sc++;
                System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                gf4=1;
                gf1=0;gf2=0;gf3=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            break;
        }
    }

    void game5()throws IOException
    {
        String ans5;String qq;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Welcome to 'The Return of the Riddles'");
            System.out.println("The final installment in 'The Lord of the Riddles' duology");
            System.out.println("The rules remain the same");
            System.out.println("Oh and by the way,");
            System.out.println("No hints");
            System.out.println("Sequels generally expect the viewer to have seen the original");
            System.out.println("And they generally raise the level of ther plot");
            System.out.println("Ready or not, Lets begin!  {Press Enter to Continue}");
            String next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("A box without hinges, key, or lid,");
            System.out.println("Yet golden treasure inside is hid,");
            ans5=in.readLine();
            if(ans5.equalsIgnoreCase("Egg")||ans5.equalsIgnoreCase("Eggs"))
            {
                System.out.println("\u000c");
                System.out.println("Correct answer!!!");
                System.out.println();
                System.out.println("Second question");
                System.out.println("Alive without breath,");
                System.out.println("As cold as death;");
                System.out.println("Never thirsty, ever drinking,");
                System.out.println("All in mail never clinking.");
                ans5=in.readLine();
                if(ans5.equalsIgnoreCase("Fish")||ans5.equalsIgnoreCase("Fishes"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct answer!!!");
                    System.out.println();
                    System.out.println("Third question");
                    System.out.println("This thing all things devours:");
                    System.out.println("Birds, beasts, trees, flowers;");
                    System.out.println("Gnaws iron, bites steel;");
                    System.out.println("Grinds hard stones to meal");
                    System.out.println("Slays king, ruins town,");
                    System.out.println("And beats high mountain down");
                    ans5=in.readLine();
                    if(ans5.equalsIgnoreCase("Time"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct answer!!!");
                        System.out.println();
                        System.out.println("Final question");
                        System.out.println("What has roots as nobody sees,");
                        System.out.println("Is taller than trees,");
                        System.out.println("Up, up it goes,");
                        System.out.println("And yet never grows?");
                        System.out.println();
                        ans5=in.readLine();
                        if(ans5.equalsIgnoreCase("Mountain"))
                        {
                            System.out.println("\u000c");
                            scoreboard[sc]="Game 5 - The Return of the Riddles     Won";
                            sc++;
                            System.out.println("Your wit is legendary!");
                            System.out.println("Here. A gift of 4000 conpoints to honour your wit");
                            con=con+4000;gf5=0;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else
                        {
                            System.out.println("It doesn't matter what you wrote...");
                            scoreboard[sc]="Game 5 - The Return of the Riddles     Lost";
                            sc++;
                            System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                            gf5=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;                            
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                    }
                    else
                    {
                        System.out.println("It doesn't matter what you wrote...");
                        scoreboard[sc]="Game 5 - The Return of the Riddles     Lost";
                        sc++;
                        gf5=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;                         
                        System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                }
                else
                {
                    System.out.println("It doesn't matter what you wrote...");
                    scoreboard[sc]="Game 5 - The Return of the Riddles     Lost";
                    sc++;
                    gf5=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;                       
                    System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
            }
            else
            {
                System.out.println("It doesn't matter what you wrote...");
                scoreboard[sc]="Game 5 - The Return of the Riddles     Lost";
                sc++;
                gf5=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;                   
                System.out.println("...Because that's the wrong answer even if it's close (Yeah, I know that's not fair)");
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            break;
        }
    }

    void game6()throws IOException
    {
        String ans6,qq,next;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Welcome to the first installment in the Trivial Questions Trilogy");
            System.out.println("In this installment, we will be focussing on famous personalities...");
            System.out.println("...none of us might probably be aware of");
            System.out.println("Ready or not, Lets Begin! {Press Enter to Continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("Who is known as 'The Father of Geometry'");
            System.out.println("a=Aristotle");
            System.out.println("b=Euclid");
            System.out.println("c=Pythagoras");
            System.out.println("d=Kepler");
            System.out.println("Type the letter corresponding to the answer you choose");
            ans6=in.readLine();
            if(ans6.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                sc++;
                gf6=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans6.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                sc++;
                gf6=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans6.equalsIgnoreCase("d"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                sc++;
                gf6=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans6.equalsIgnoreCase("b"))
            {
                System.out.println("\u000c");            
                System.out.println("Correct answer");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("What is common between Kutty, Shankar, Laxman and Sudhir Dar?");
                System.out.println("a=Drawing cartoons");
                System.out.println("b=Film Direction");
                System.out.println("c=Instrumental Music");
                System.out.println("d=Classical Dance");
                ans6=in.readLine();
                if(ans6.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                    sc++;
                    gf6=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans6.equalsIgnoreCase("b"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                    sc++;
                    gf6=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans6.equalsIgnoreCase("d"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                    sc++;
                    gf6=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans6.equalsIgnoreCase("a"))
                {
                    System.out.println("\u000c");                
                    System.out.println("Correct answer");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("Ms. Vijaya Mehta has earned distinction in which of the field?");
                    System.out.println("a=Theatre");
                    System.out.println("b=Film Direction");
                    System.out.println("c=Journalism");
                    System.out.println("d=Classical Dance");
                    ans6=in.readLine();
                    if(ans6.equalsIgnoreCase("c"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                        sc++;
                        gf6=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans6.equalsIgnoreCase("b"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                        sc++;
                        gf6=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans6.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                        sc++;
                        gf6=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans6.equalsIgnoreCase("a"))
                    {
                        System.out.println("\u000c");                    
                        System.out.println("Correct answer");
                        System.out.println();
                        System.out.println("Question 3");
                        System.out.println("Dr. M. S. Swaminathan has distinguished himself in which of the following fields?");
                        System.out.println("a=Physics");
                        System.out.println("b=Agriculture");
                        System.out.println("c=Medicine");
                        System.out.println("d=Astrophysics");
                        ans6=in.readLine();
                        if(ans6.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                            sc++;
                            gf6=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans6.equalsIgnoreCase("a"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                            sc++;
                            gf6=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans6.equalsIgnoreCase("d"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                            sc++;
                            gf6=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans6.equalsIgnoreCase("b"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct answer");
                            System.out.println();
                            System.out.println("Question 4");
                            System.out.println("Dr. Amiya Chakravarthy is known for his");
                            System.out.println("a=work in the Chipko movement");
                            System.out.println("b=composing music for Ray's films");
                            System.out.println("c=being literary Secretary to R. N. Tagore");
                            System.out.println("d=patenting a living organism");
                            ans6=in.readLine();
                            if(ans6.equalsIgnoreCase("b"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                sc++;
                                gf6=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans6.equalsIgnoreCase("a"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                sc++;
                                gf6=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans6.equalsIgnoreCase("d"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                sc++;
                                gf6=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans6.equalsIgnoreCase("c"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct answer");
                                System.out.println();
                                System.out.println("Question 5");
                                System.out.println("In which of the following dance forms 'Guru Kelucharan Mohapatra' is associated with?");
                                System.out.println("a=Kathak");
                                System.out.println("b=Odissi");
                                System.out.println("c=Kathakali");
                                System.out.println("d=Bharathanatiyam");
                                ans6=in.readLine();
                                if(ans6.equalsIgnoreCase("c"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                    sc++;
                                    gf6=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans6.equalsIgnoreCase("a"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                    sc++;
                                    gf6=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans6.equalsIgnoreCase("d"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                    sc++;
                                    gf6=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans6.equalsIgnoreCase("b"))
                                {
                                    System.out.println("\u000c");
                                    System.out.println("Correct answer");
                                    System.out.println();
                                    System.out.println("Question 6");
                                    System.out.println("Which of the following pairs of artists and their areas of specialization is not correct?");
                                    System.out.println("a=Ustad Zakir Hussain Khan -> Tabla");
                                    System.out.println("b=Pt. Ravi Shankar -> Sitar");
                                    System.out.println("c=M. S. Subbulakshmi -> Dance");
                                    System.out.println("d=Hari Prasad Chaurasia -> Flute");
                                    ans6=in.readLine();
                                    if(ans6.equalsIgnoreCase("b"))
                                    {
                                        System.out.println("Wrong answer");
                                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                        sc++;
                                        gf6=1;
                                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                        System.out.println("Press Enter to Continue");
                                        qq=in.readLine();
                                        ob.play();
                                    }
                                    else if(ans6.equalsIgnoreCase("a"))
                                    {
                                        System.out.println("Wrong answer");
                                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                        sc++;
                                        gf6=1;
                                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                        System.out.println("Press Enter to Continue");
                                        qq=in.readLine();
                                        ob.play();
                                    }
                                    else if(ans6.equalsIgnoreCase("d"))
                                    {
                                        System.out.println("Wrong answer");
                                        scoreboard[sc]="Game 6 - Trivial Questions I     Lost";
                                        sc++;
                                        gf6=1;
                                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                        System.out.println("Press Enter to Continue");
                                        qq=in.readLine();
                                        ob.play();
                                    }
                                    else if(ans6.equalsIgnoreCase("c"))
                                    {
                                        System.out.println("\u000c");
                                        scoreboard[sc]="Game 6 - Trivial Questions I     Won";
                                        sc++;gf6=0;
                                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                        System.out.println("Correct answer");
                                        System.out.println("That was the last question");
                                        System.out.println("You win 1750 conpoints");
                                        con=con+1750;
                                        System.out.println("Press Enter to Continue");
                                        qq=in.readLine();
                                        ob.play();
                                    }
                                    else
                                    {
                                        System.out.println("Wrong input");
                                        System.out.println("Press 1 to restart");
                                        System.out.println("Press 2 to go back");
                                        qq=in.readLine();
                                        if(qq.equalsIgnoreCase("1"))
                                            continue;
                                        else
                                        {
                                            ob.play();
                                            break;
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("Wrong input");
                                    System.out.println("Press 1 to restart");
                                    System.out.println("Press 2 to go back");
                                    qq=in.readLine();
                                    if(qq.equalsIgnoreCase("1"))
                                        continue;
                                    else
                                    {
                                        ob.play();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game7()throws IOException
    {
        String ans7,qq,next;
        while(true)
        {

            System.out.println("\u000c");
            System.out.println("Welcome to the second installment in the Trivial Questions Trilogy");
            System.out.println("In this installment, we will be focussing on science and technology");
            System.out.println("Ready or not, Lets Begin! {Press Enter to Continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("In which decade with the first transatlantic radio broadcast occur?");
            System.out.println("a=1890");
            System.out.println("b=1900");
            System.out.println("c=1910");
            System.out.println("d=1920");
            ans7=in.readLine();
            if(ans7.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                sc++;
                gf7=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans7.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                sc++;
                gf7=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans7.equalsIgnoreCase("d"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                sc++;
                gf7=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans7.equalsIgnoreCase("b"))
            {
                System.out.println("\u000c");
                System.out.println("Correct answer");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("The purpose of choke in tube light is ?");
                System.out.println("a=To decrease the current");
                System.out.println("b=To increase the current");
                System.out.println("c=To decrease the voltage momentarily");
                System.out.println("d=To increase the voltage momentarily");
                ans7=in.readLine();
                if(ans7.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                    sc++;
                    gf7=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans7.equalsIgnoreCase("a"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                    sc++;
                    gf7=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans7.equalsIgnoreCase("b"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                    sc++;
                    gf7=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans7.equalsIgnoreCase("d"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct answer");
                    System.out.println();
                    System.out.println("Question 3");

                    System.out.println("What is the other name for Wormholes");
                    System.out.println("a=Advection");
                    System.out.println("b=Apollyon");
                    System.out.println("c=Einstien-Rosen Bridge");
                    System.out.println("d=Schwarzschild radius,");
                    ans7=in.readLine();
                    if(ans7.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                        sc++;
                        gf7=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans7.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                        sc++;
                        gf7=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans7.equalsIgnoreCase("b"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                        sc++;
                        gf7=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans7.equalsIgnoreCase("c"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct answer");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("Which of these is not a time travel paradox");
                        System.out.println("a=Predestination Paradox");
                        System.out.println("b=Grandfather Paradox");
                        System.out.println("c=Causal Loop");
                        System.out.println("d=Socratic paradox");
                        ans7=in.readLine();
                        if(ans7.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                            sc++;
                            gf7=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans7.equalsIgnoreCase("a"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                            sc++;
                            gf7=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans7.equalsIgnoreCase("b"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                            sc++;
                            gf7=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans7.equalsIgnoreCase("d"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct answer");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("What is the approximate weight of the internet (in kilograms)?");
                            ans7=in.readLine();
                            if(ans7.equalsIgnoreCase("0.05"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct answer");
                                System.out.println();
                                System.out.println("Question 5");
                                System.out.println("Which is the study of dreams called?");
                                System.out.println("a=Anthropology");
                                System.out.println("b=Horology");
                                System.out.println("c=Oneirology");
                                System.out.println("d=Ethology");
                                if(ans7.equalsIgnoreCase("a"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                                    sc++;
                                    gf7=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans7.equalsIgnoreCase("b"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                                    sc++;
                                    gf7=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans7.equalsIgnoreCase("c"))
                                {
                                    System.out.println("Correct Answer!!!");
                                    scoreboard[sc]="Game 7 - Trivial Questions II     Won";
                                    sc++;gf7=0;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("You win 1750 conpoints");
                                    con=con+1750;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans7.equalsIgnoreCase("d"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                                    sc++;
                                    gf7=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 7 - Trivial Questions II     Lost";
                            sc++;
                            gf7=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf8=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game8()throws IOException
    {
        String ans8,qq,next;
        while(true)
        {        
            System.out.println("\u000c");
            System.out.println("Welcome to the final installment in the Trivial Questions Trilogy");
            System.out.println("In this installment, we will be exploring our world and beyond");
            System.out.println("Ready or not, Lets Begin! {Press Enter to Continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("On which castle is the castle of 'Sleeping Beauty' based on?");
            System.out.println("a=Palace of Holyrood House");
            System.out.println("b=Bran Castle");
            System.out.println("c=Balmoral Castle");
            System.out.println("d=Neuschwanstein Castle");
            ans8=in.readLine();
            if(ans8.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                sc++;
                gf8=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans8.equalsIgnoreCase("b"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                sc++;
                gf8=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans8.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                sc++;
                gf8=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans8.equalsIgnoreCase("d"))
            {
                System.out.println("\u000c");
                System.out.println("Correct answer");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("Which is the highest peak of the Solar System?");
                System.out.println("a=Mount Everest");
                System.out.println("b=Rheasilvia Central Peak");
                System.out.println("c=Caloris Montes");
                System.out.println("d=Olympus Mons");
                ans8=in.readLine();
                if(ans8.equalsIgnoreCase("a"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                    sc++;
                    gf8=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans8.equalsIgnoreCase("d"))
                {
                    System.out.println("That would've been the answer 40 years ago");
                    System.out.println("But now, it's wrong");
                    scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                    sc++;
                    gf8=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans8.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                    sc++;
                    gf8=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans8.equalsIgnoreCase("b"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct answer");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("Which of these rivers is an Asian river?");
                    System.out.println("a=River Po");
                    System.out.println("b=River Lena");
                    System.out.println("c=Ubangi River");
                    System.out.println("d=Pilcomayo River");
                    ans8=in.readLine();
                    if(ans8.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                        sc++;
                        gf8=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans8.equalsIgnoreCase("d"))
                    {
                        scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                        sc++;
                        System.out.println("Wrong answer");
                        gf8=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans8.equalsIgnoreCase("c"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                        sc++;
                        gf8=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans8.equalsIgnoreCase("b"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct answer");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("Which is the only planet in the Solar System that can float on water?");
                        System.out.println("a=Saturn");
                        System.out.println("b=Neptune");
                        System.out.println("c=Earth");
                        System.out.println("d=Pluto");
                        ans8=in.readLine();
                        if(ans8.equalsIgnoreCase("b"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                            sc++;
                            gf8=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans8.equalsIgnoreCase("d"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                            sc++;
                            gf8=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans8.equalsIgnoreCase("c"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                            sc++;
                            gf8=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans8.equalsIgnoreCase("a"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct answer");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("Where are the Blood Falls located?");
                            System.out.println();
                            System.out.println("Type the answer");
                            ans8=in.readLine();
                            if(ans8.equalsIgnoreCase("Antarctica"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct answer");
                                System.out.println();
                                System.out.println("Question 6");
                                System.out.println("Which of these is another name for Mount Everest?");
                                System.out.println("a=Znumulangma Peak");
                                System.out.println("b=Mount Godwin-Austen");
                                System.out.println("c=Kangrinboqê");
                                System.out.println("d=Mount Narodnaya");
                                ans8=in.readLine();
                                if(ans8.equalsIgnoreCase("b")||ans8.equalsIgnoreCase("c")||ans8.equalsIgnoreCase("a"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                                    sc++;
                                    gf8=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                    break;
                                }
                                else if(ans8.equalsIgnoreCase("d"))
                                {
                                    System.out.println("Correct Answer!!!");
                                    scoreboard[sc]="Game 8 - Trivial Questions III     Won";
                                    sc++;gf8=0;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("You win 1750 conpoints");
                                    con=con+1750;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else
                                {
                                    System.out.println("Wrong input");
                                    System.out.println("Press 1 to restart");
                                    System.out.println("Press 2 to go back");
                                    qq=in.readLine();
                                    if(qq.equalsIgnoreCase("1"))
                                        continue;
                                    else
                                    {
                                        ob.play();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 8 - Trivial Questions III     Lost";
                                sc++;
                                gf8=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf9=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game9()throws IOException
    {
        String ans9,qq,next;
        while(true)
        {
            System.out.println("\u000c");
            System.out.println("This quiz tests your knowledge in computers");
            System.out.println("Ready or not, Lets Begin! {Press Enter to Continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("Which disk format can be accessed by MS-Dos 6.0?");
            System.out.println("a=OSX");
            System.out.println("b=FAT");
            System.out.println("c=NTFS");
            System.out.println("d=EXT2");
            ans9=in.readLine();
            if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("c")||ans9.equalsIgnoreCase("d"))
            {
                System.out.println("Wrong answer");
                scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                sc++;
                gf9=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else if(ans9.equalsIgnoreCase("b"))
            {
                System.out.println("\u000c");
                System.out.println("Correct answer");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("A series of MS-Dos commands can be performed by...");
                System.out.println("a=...Typing all the Command Prompts in series by hiding a hyphen");
                System.out.println("b=...Copying all commands into a single directory");
                System.out.println("c=...Creating a .BAT file");
                System.out.println("d=...It's Impossible");
                ans9=in.readLine();
                if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("b")||ans9.equalsIgnoreCase("d"))
                {
                    System.out.println("Wrong answer");
                    scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                    sc++;
                    gf9=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                }
                else if(ans9.equalsIgnoreCase("c"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct answer");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("While starting Windows XP/Windows 7, extra booting options can be shown by...");
                    System.out.println("a=F1");
                    System.out.println("b=F8");
                    System.out.println("c=F9");
                    System.out.println("d=F12");
                    ans9=in.readLine();
                    if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("c")||ans9.equalsIgnoreCase("d"))
                    {
                        System.out.println("Wrong answer");
                        scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                        sc++;
                        gf9=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                    }
                    else if(ans9.equalsIgnoreCase("b"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct answer");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("In Computer Architecture, a Bus is...");
                        System.out.println("a=A collection of various softwares");
                        System.out.println("b=A collection of various computers");
                        System.out.println("c=A collection of shared communication wires");
                        System.out.println("d=A collection of chairs where the user sits");
                        ans9=in.readLine();
                        if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("b")||ans9.equalsIgnoreCase("d"))
                        {
                            System.out.println("Wrong answer");
                            scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                            sc++;
                            gf9=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                        }
                        else if(ans9.equalsIgnoreCase("c"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct answer");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("Which of the memories has the shortest access system");
                            System.out.println("a=Virtual Memory");
                            System.out.println("b=Cache Memory");
                            System.out.println("c=External Memory");
                            System.out.println("d=Registry");
                            ans9=in.readLine();
                            if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("b")||ans9.equalsIgnoreCase("c"))
                            {
                                System.out.println("Wrong answer");
                                scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                                sc++;
                                gf9=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                            }
                            else if(ans9.equalsIgnoreCase("d"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct answer");
                                System.out.println();
                                System.out.println("Question 6");
                                System.out.println("Which of the following memories need refreshes");
                                System.out.println("a=Dynamic Random Access Memory");
                                System.out.println("b=Static Random Access Memory");
                                System.out.println("c=Read Only Memory");
                                System.out.println("d=All of the Above");
                                ans9=in.readLine();
                                if(ans9.equalsIgnoreCase("a")||ans9.equalsIgnoreCase("b")||ans9.equalsIgnoreCase("c"))
                                {
                                    System.out.println("Wrong answer");
                                    scoreboard[sc]="Game 9 - Compu-tech's     Lost";
                                    sc++;
                                    gf9=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else if(ans9.equalsIgnoreCase("d"))
                                {
                                    System.out.println("\u000c");
                                    scoreboard[sc]="Game 9 - Compu-tech's     Won";
                                    sc++;gf9=0;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf10=0;gf11=0;gf12=0;
                                    System.out.println("Correct answer");
                                    System.out.println();
                                    System.out.println("You win 1000 conpoints");
                                    con=con+1000;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                }
                                else
                                {
                                    System.out.println("Wrong input");
                                    System.out.println("Press 1 to restart");
                                    System.out.println("Press 2 to go back");
                                    qq=in.readLine();
                                    if(qq.equalsIgnoreCase("1"))
                                        continue;
                                    else
                                    {
                                        ob.play();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }
            break;
        }
    }

    void game10()throws IOException
    {
        String ans10,qq;
        while(true)
        {
            System.out.println("\u000c");
            System.out.println("Albert and Bernard just became friends with Cheryl,"); 
            System.out.println("and they want to know when her birthday is."); 
            System.out.println("Cheryl gives them a list of 10 possible dates.");
            System.out.println();
            System.out.println("May 15, May 16,  May 19");
            System.out.println("June 17, June 18");
            System.out.println("July 14, July 16");
            System.out.println("August 14, August 15, August 17");
            System.out.println();
            System.out.println("Cheryl then tells Albert and Bernard separately");
            System.out.println("the month and the day of her birthday respectively.");            
            System.out.println();
            System.out.println("Albert: I don’t know when Cheryl’s birthday is, but I know that Bernard does not know too.");
            System.out.println("Bernard: At first I don’t know when Cheryl’s birthday is, but I know now.");
            System.out.println("Albert: Then I also know when Cheryl’s birthday is.");
            System.out.println();
            System.out.println("So when is Cheryl’s birthday?");
            ans10=in.readLine();
            if(ans10.equalsIgnoreCase("July 16")||ans10.equalsIgnoreCase("July16"))
            {
                System.out.println("\u000c");
                scoreboard[sc]="Game 10 - Cheryl's Birthday     Won";
                sc++;
                System.out.println("Correct answer");
                System.out.println("Wow! You're a genius!");
                System.out.println();
                System.out.println("You win 3900 conpoints");
                con=con+3900;gf10=0;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
            }
            else
            {
                System.out.println("Wrong!!");
                scoreboard[sc]="Game 10 - Cheryl's Birthday     Lost";
                sc++;
                gf10=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf11=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
                break;
            }
            break;
        }
    }

    void game11()throws IOException
    {
        String ans11,qq,next;
        while(true)
        {
            System.out.println("\u000c");
            System.out.println("Welcome to to Comic and Manga Quiz");
            System.out.println("This is the quiz for hardcore comic and manga fans");
            System.out.println("Ready or not, Lets begin! {Press enter to continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("Who was the first ever MARVEL superhero?");
            System.out.println("a=Captain America");
            System.out.println("b=Spider Man");
            System.out.println("c=Daredevil");
            System.out.println("d=The Human Torch");
            ans11=in.readLine();
            if(ans11.equalsIgnoreCase("a")||ans11.equalsIgnoreCase("b")||ans11.equalsIgnoreCase("c"))
            {
                System.out.println("Wrong Answer");
                scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                sc++;
                gf11=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
                break;
            }
            else if(ans11.equalsIgnoreCase("d"))
            {
                System.out.println("\u000c");

                System.out.println("Correct Answer!");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("Which of these manga has the author of Fullmetal Alchemist written?");
                System.out.println("a=Arslan Senki");
                System.out.println("b=Gin no Saji");
                System.out.println("c=Anohana");
                System.out.println("d=Spider Man");
                ans11=in.readLine();
                if(ans11.equalsIgnoreCase("a")||ans11.equalsIgnoreCase("d")||ans11.equalsIgnoreCase("c"))
                {
                    System.out.println("Wrong Answer");
                    scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                    sc++;
                    gf11=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                    break;
                }
                else if(ans11.equalsIgnoreCase("b"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct Answer!");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("Which of these comics is not published by Marvel?");
                    System.out.println("a=Watchmen");
                    System.out.println("b=Fantastic Four");
                    System.out.println("c=Thunderbolts");
                    System.out.println("d=Strange Tales");
                    ans11=in.readLine();
                    if(ans11.equalsIgnoreCase("b")||ans11.equalsIgnoreCase("d")||ans11.equalsIgnoreCase("c"))
                    {
                        System.out.println("Wrong Answer");
                        scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                        sc++;
                        gf11=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                        break;
                    }
                    else if(ans11.equalsIgnoreCase("a"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct Answer!");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("Which of the following is not written by Tsugumi Ohba");
                        System.out.println("a=Hikaru no Go");
                        System.out.println("b=Death Note");
                        System.out.println("c=Tokyo Ghoul");
                        System.out.println("d=Platinum End");
                        ans11=in.readLine();
                        if(ans11.equalsIgnoreCase("b")||ans11.equalsIgnoreCase("d")||ans11.equalsIgnoreCase("a"))
                        {
                            System.out.println("Wrong Answer");
                            scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                            sc++;
                            gf11=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                            break;
                        }
                        else if(ans11.equalsIgnoreCase("c"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct Answer!");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("Which of these members are not in the Avengers?");
                            System.out.println("a=Wasp");
                            System.out.println("b=Moondragon");
                            System.out.println("c=A-Bomb");
                            System.out.println("d=Aireo");
                            ans11=in.readLine();
                            if(ans11.equalsIgnoreCase("b")||ans11.equalsIgnoreCase("c")||ans11.equalsIgnoreCase("a"))
                            {
                                System.out.println("Wrong Answer");
                                scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                                sc++;
                                gf11=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                                break;
                            }
                            else if(ans11.equalsIgnoreCase("d"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct Answer!");
                                System.out.println();
                                System.out.println("Question 6");
                                System.out.println("Which manga/anime has Gintama not parodied?");
                                System.out.println("a=Berserk");
                                System.out.println("b=Cowboy Bebop");
                                System.out.println("c=Legend of the Galactic Heroes");
                                System.out.println("d=Ninja Hattori");
                                ans11=in.readLine();
                                if(ans11.equalsIgnoreCase("c")||ans11.equalsIgnoreCase("d")||ans11.equalsIgnoreCase("a"))
                                {
                                    System.out.println("Wrong Answer");
                                    scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Lost";
                                    sc++;
                                    gf11=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                    break;
                                }
                                else if(ans11.equalsIgnoreCase("b"))
                                {
                                    System.out.println("\u000c");
                                    scoreboard[sc]="Game 11 - The Comic and Manga Quiz     Won";
                                    sc++;gf11=0;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf12=0;
                                    System.out.println("Correct Answer!");
                                    System.out.println();
                                    System.out.println("You're good at this");
                                    System.out.println("You win 1000 conpoints");
                                    con=con+1000;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                    break;
                                }
                                else
                                {
                                    System.out.println("Wrong input");
                                    System.out.println("Press 1 to restart");
                                    System.out.println("Press 2 to go back");
                                    qq=in.readLine();
                                    if(qq.equalsIgnoreCase("1"))
                                        continue;
                                    else
                                    {
                                        ob.play();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }

        }
    }

    void game12()throws IOException
    {
        String ans12,qq,next;
        while(true)
        {
            System.out.println("\u000c");
            System.out.println("Welcome to the Movies and Video Games Quiz");
            System.out.println("The title should be self-explanatory");
            System.out.println("Ready or not, Lets begin! {Press enter to continue}");
            next=in.readLine();
            System.out.println("\u000c");
            System.out.println("Question 1");
            System.out.println("Which is the best-selling video game franchise of all time?");
            System.out.println("a=Grand Theft Auto");
            System.out.println("b=FIFA");
            System.out.println("c=Mario");
            System.out.println("d=The Sims");
            ans12=in.readLine();
            if(ans12.equalsIgnoreCase("b")||ans12.equalsIgnoreCase("d")||ans12.equalsIgnoreCase("a"))
            {
                System.out.println("Wrong Answer");
                scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                sc++;
                gf12=1;
                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                System.out.println("Press Enter to Continue");
                qq=in.readLine();
                ob.play();
                break;
            }
            else if(ans12.equalsIgnoreCase("c"))
            {
                System.out.println("\u000c");
                System.out.println("Correct Answer!");
                System.out.println();
                System.out.println("Question 2");
                System.out.println("Who is the director of 'The Godfather'");
                System.out.println("a=Alfred Hitchcock");
                System.out.println("b=Orson Welles");
                System.out.println("c=Robert Mulligan");
                System.out.println("d=Francis Ford Coppola");
                ans12=in.readLine();
                if(ans12.equalsIgnoreCase("b")||ans12.equalsIgnoreCase("c")||ans12.equalsIgnoreCase("a"))
                {
                    System.out.println("Wrong Answer");
                    scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                    sc++;
                    gf12=1;
                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                    System.out.println("Press Enter to Continue");
                    qq=in.readLine();
                    ob.play();
                    break;
                }
                else if(ans12.equalsIgnoreCase("d"))
                {
                    System.out.println("\u000c");
                    System.out.println("Correct Answer!");
                    System.out.println();
                    System.out.println("Question 3");
                    System.out.println("Which game introduced the ability to save game files?");
                    System.out.println("a=Donkey Kong");
                    System.out.println("b=The Legend of Zelda");
                    System.out.println("c=Half-Life");
                    System.out.println("d=Tetris");
                    ans12=in.readLine();
                    if(ans12.equalsIgnoreCase("d")||ans12.equalsIgnoreCase("c")||ans12.equalsIgnoreCase("a"))
                    {
                        System.out.println("Wrong Answer");
                        scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                        sc++;
                        gf12=1;
                        gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                        System.out.println("Press Enter to Continue");
                        qq=in.readLine();
                        ob.play();
                        break;
                    }
                    else if(ans12.equalsIgnoreCase("b"))
                    {
                        System.out.println("\u000c");
                        System.out.println("Correct Answer!");
                        System.out.println();
                        System.out.println("Question 4");
                        System.out.println("Which is the first PIXAR creation?");
                        System.out.println("a=Toy Story");
                        System.out.println("b=The Adventures of André and Wally B");
                        System.out.println("c=Luxo Jr.");
                        System.out.println("d=A Bug's Life");
                        ans12=in.readLine();
                        if(ans12.equalsIgnoreCase("d")||ans12.equalsIgnoreCase("c")||ans12.equalsIgnoreCase("a"))
                        {
                            System.out.println("Wrong Answer");
                            scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                            sc++;
                            gf12=1;
                            gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                            System.out.println("Press Enter to Continue");
                            qq=in.readLine();
                            ob.play();
                            break;
                        }
                        else if(ans12.equalsIgnoreCase("b"))
                        {
                            System.out.println("\u000c");
                            System.out.println("Correct Answer!");
                            System.out.println();
                            System.out.println("Question 5");
                            System.out.println("Which game does Master Chief belong to?");
                            System.out.println("a=Halo");
                            System.out.println("b=Dota 2");
                            System.out.println("c=World of Warcraft");
                            System.out.println("d=Counter Strike");
                            ans12=in.readLine();
                            if(ans12.equalsIgnoreCase("d")||ans12.equalsIgnoreCase("c")||ans12.equalsIgnoreCase("b"))
                            {
                                System.out.println("Wrong Answer");
                                scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                                sc++;
                                gf12=1;
                                gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                                System.out.println("Press Enter to Continue");
                                qq=in.readLine();
                                ob.play();
                                break;
                            }
                            else if(ans12.equalsIgnoreCase("a"))
                            {
                                System.out.println("\u000c");
                                System.out.println("Correct Answer!");
                                System.out.println();
                                System.out.println("Question 6");
                                System.out.println("For which of these achievements has The Empire Strikes Back recieved an Academy Award?");
                                System.out.println("a=Best Director");
                                System.out.println("b=Best Actor");
                                System.out.println("c=Best Cinematography");
                                System.out.println("d=Best Sound");
                                ans12=in.readLine();
                                if(ans12.equalsIgnoreCase("a")||ans12.equalsIgnoreCase("c")||ans12.equalsIgnoreCase("b"))
                                {
                                    System.out.println("Wrong Answer");
                                    scoreboard[sc]="Game 12 - Video Games and Movies     Lost";
                                    sc++;
                                    gf12=1;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                    break;
                                }
                                else if(ans12.equalsIgnoreCase("d"))
                                {
                                    System.out.println("\u000c");
                                    System.out.println("Correct Answer!");
                                    scoreboard[sc]="Game 12 - Video Games and Movies     Won";
                                    sc++;gf12=0;
                                    gf1=0;gf2=0;gf3=0;gf4=0;gf5=0;gf6=0;gf7=0;gf8=0;gf9=0;gf10=0;gf11=0;
                                    System.out.println();
                                    System.out.println("This was the final question");
                                    System.out.println("You win 1000 conpoints");
                                    con=con+1000;
                                    System.out.println("Press Enter to Continue");
                                    qq=in.readLine();
                                    ob.play();
                                    break;
                                }
                                else
                                {
                                    System.out.println("Wrong input");
                                    System.out.println("Press 1 to restart");
                                    System.out.println("Press 2 to go back");
                                    qq=in.readLine();
                                    if(qq.equalsIgnoreCase("1"))
                                        continue;
                                    else
                                    {
                                        ob.play();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Wrong input");
                                System.out.println("Press 1 to restart");
                                System.out.println("Press 2 to go back");
                                qq=in.readLine();
                                if(qq.equalsIgnoreCase("1"))
                                    continue;
                                else
                                {
                                    ob.play();
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Wrong input");
                            System.out.println("Press 1 to restart");
                            System.out.println("Press 2 to go back");
                            qq=in.readLine();
                            if(qq.equalsIgnoreCase("1"))
                                continue;
                            else
                            {
                                ob.play();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong input");
                        System.out.println("Press 1 to restart");
                        System.out.println("Press 2 to go back");
                        qq=in.readLine();
                        if(qq.equalsIgnoreCase("1"))
                            continue;
                        else
                        {
                            ob.play();
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Press 1 to restart");
                    System.out.println("Press 2 to go back");
                    qq=in.readLine();
                    if(qq.equalsIgnoreCase("1"))
                        continue;
                    else
                    {
                        ob.play();
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong input");
                System.out.println("Press 1 to restart");
                System.out.println("Press 2 to go back");
                qq=in.readLine();
                if(qq.equalsIgnoreCase("1"))
                    continue;
                else
                {
                    ob.play();
                    break;
                }
            }

        }
    }

    void quizrecord()throws IOException
    {
        System.out.println("\u000c");
        System.out.println("This is a record of all the quizzes you've solved and whether you've won in them or not");
        System.out.println("This does not include the quizzes in which you've forfeited by entering the wrong input");
        System.out.println();
        if(sc==0)
            System.out.println("No quizzes solved");
        else
            for(j=0;j<sc;j++)
                System.out.println(scoreboard[j]);
        System.out.println();
        System.out.println("Press Enter to Continue");
        String qq=in.readLine();
        ob.mainchoice();
    }

    void exit()throws IOException
    {

        String choice;
        System.out.println("\u000c");
        System.out.println("Are you sure?");
        System.out.println("no=Return to main screen");
        System.out.println("Enter=Exit");
        choice=in.readLine();
        if(choice.equalsIgnoreCase("no"))
            ob.mainchoice();
        else
        {
            System.out.println("\u000c");
            System.out.println("Well, see ya");
            gf1=0;
            gf2=0;
            gf3=0;
            gf4=0;
            gf5=0;
            gf6=0;
            gf7=0;
            gf8=0;
            gf9=0;
            gf10=0;
            gf11=0;
            gf12=0;
            k=0;
            gg=0;
            gd=0;
            con=1000;
        }
    }
}
