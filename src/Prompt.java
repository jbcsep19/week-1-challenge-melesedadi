import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String prompt = " ";
        System.out.println("Welcome Java Week One Challenge Adeventure!");
        System.out.println();
        System.out.println("You are in a creepy house today. Would you like to go to (kitchen) or (upstairs) or (Patio) or (living room) or (basement): ");
        prompt = keyboard.nextLine();
        if (prompt.equalsIgnoreCase("kitchen")) {
            System.out.println("You choose " + prompt);
            System.out.println("Would you like to Open (refrigerator) or (cabinet)?: ");
            prompt = keyboard.nextLine();
            if (prompt.equalsIgnoreCase("refrigerator")) {
                System.out.println("You choose to open " + prompt + ".Would lke to (drink) strange milk or (eat) leftovers?: ");
                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("drink")) { //open3
                    System.out.println("You choose to " + prompt + " strange milk. Enjoy your milk!");
                } else if (prompt.equalsIgnoreCase("eat")) {
                    System.out.println("You choose to " + prompt + "leftovers. Enjoy eating the leaftovers");
                } else {
                    System.out.println(" You didn't select the right choice. You are dying starvation");
                }
            } else if (prompt.equalsIgnoreCase("cabinet")) {
                System.out.println("You chose to open " + prompt + ". Would lke to eat can of (bean) or take a (plate)");


                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("bean")) {
                    System.out.println("You choose to eat a can of " + prompt + ". Enjoy eating a " + prompt + ".");

                } else if (prompt.equalsIgnoreCase("plate")) {
                    System.out.println("You choose to take " + prompt + ". Enjoy your plate");
                } else {
                    System.out.println(" You di not chose the right choices. You are dying starvation");

                }
            } else {
                System.out.println(" You did not slect the right choice. You should make the right selection next time.");
            }
            prompt = keyboard.nextLine();
        }else if (prompt.equalsIgnoreCase("upstairs")) {
            System.out.println("You choose to go to " + prompt + ". Would you like to Open (bedroom) or (bathroom)?: ");
            prompt = keyboard.nextLine();
            if (prompt.equalsIgnoreCase("bedroom")) {
                System.out.println(" You choose to got to " + prompt + ". Would you like to lay on (bed) or open the (drawer)?: ");

                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("bed")) {
                    System.out.println("You choose to lay on the " + prompt + ". Enjoy taking a rest.");
                } else if (prompt.equalsIgnoreCase("drawer")) {
                    System.out.println("You choose to open " + prompt + ". Enjoy looking staffs in the drawer. Once you done, do not forget to close the " + prompt + ".");
                } else {
                    System.out.println(" You did not select the right choice. Make ure you slected the right selection next time.");
                }
            } else if (prompt.equalsIgnoreCase("bathroom")) {
                System.out.println("You choose to go to " + prompt + ".Would you like to Open (bedroom) or (bathroom)?: ");

                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("bedroom")) {
                    System.out.println(" You choose to got to " + prompt + ". Would you like to look in the (mirror) or use the (toilent)?: ");
                }
                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("mirror")) {
                    System.out.println("You choose to look in the  " + prompt + ". Enjoy it.");
                } else if (prompt.equalsIgnoreCase("toilet")) {
                    System.out.println("You got to the " + prompt + ". Don't forget flushing the " + prompt + "after use.");
                } else {
                    System.out.println(" You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");
                }
            } else {
                System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");
            }
            System.out.println();
        }
		else if (prompt.equalsIgnoreCase("patio")){
            System.out.println("You choose " + prompt);
            System.out.println("Would you go to (go) the pool or (open shed): ");
        prompt = keyboard.nextLine();
            if (prompt.equalsIgnoreCase("go")) {
                System.out.println(" You choose to " + prompt + " the pool. Would you like to (clean) the pool or (swim) in the pool)?: ");

                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("clean")) {
                    System.out.println("You choose to " + prompt + "the pool. I hope you can finish cleaning the pool on time.");
                } else if (prompt.equalsIgnoreCase("swim")) {
                    System.out.println("You choose to " + prompt + " in the pool. Enjoy swimming in the pool.");
                } else {
                    System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");
                }
            }
			else if (prompt.equalsIgnoreCase("open shed")){
            System.out.println(" You choose to " + prompt + ".");
            System.out.println("Would you like to take an (ax)or (hammer): ");
        }
                if (prompt.equalsIgnoreCase("ax")){
                    System.out.println("You choose to take an" + prompt+". woud you like to (chope a tree) or (throw the ax): ");

                prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("chop a tree")){
                            System.out.println(" You choose to take an ax to " + prompt + ". Be carefule while choping a tree.");
                        }
                    else if (prompt.equalsIgnoreCase("throw the ax")){
                    System.out.println("You chose to "+ prompt +". Becarefull when you throw the ax");
                    }
                    else
                    {System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");

                }}
                else if (prompt.equalsIgnoreCase("hammer")){

                 System.out.println("You choose to " + prompt +". Would you like to " +prompt + " a (nail)or (break) " + prompt +"?: ");

                 prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("nail")){
                        System.out.println(" You choose to hammer " + prompt + ". Good luck.");
                    }
                    else if (prompt.equalsIgnoreCase("break")){
                        System.out.println(" You choose to " + prompt + " a hammer. Be carefule while breaking a hammer.");
                    }
                    else
                    {System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");
                    }}

				else
                {System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");}}

    		else if (prompt.equalsIgnoreCase("living room")) {
            System.out.println("You choose to go to" + prompt + ". Would you go to (turn on) the TV or (sit on) the couch?: ");
            prompt = keyboard.nextLine();
            if (prompt.equalsIgnoreCase("turn on")) {
                System.out.println(" You choose to " + prompt + " the TV. Would you like to (change) the channel or (stay) on the first channel?: ");

                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("change")) {
                    System.out.println("You choose to " + prompt + "the channel. Would you like to (increase) or (decrease) the volume?: ");

                    prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("increase")) {
                        System.out.println(" You choose to " + prompt + " the volume. Don't make it too loud!");
                    } else if (prompt.equalsIgnoreCase("decrease")) {
                        System.out.println(" You choose to " + prompt + " the volume. Don't make it too low!");

                    } else {
                        System.out.println(" You did not give the right choices. You should make the right selection next time.");

                    }
                } else if (prompt.equalsIgnoreCase("stay")) {
                    System.out.println("You choose to " + prompt + " in the first channel.Would you like to go (open) or (ignore) the door?: ");

                    prompt = keyboard.nextLine();
                    if (prompt.equalsIgnoreCase("open")) {
                        System.out.println(" You choose to " + prompt + " the door. Pease don't open it too wide!");
                    } else if (prompt.equalsIgnoreCase("ignore")) {
                        System.out.println(" You choose to " + prompt + " the the door. Make sure the house sufficient light!");

                    } else {
                        System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");

                    }
                } else {
                    System.out.println("You did not select the right choice. Make sure you select the right selection on the next play. Any thank you playing the game.");
                }
            } else if (prompt.equalsIgnoreCase("sit")) {
                System.out.println(" You choose to " + prompt + "on the couch.");
                System.out.println("Would you like to (look out) the window or start to (eat)?: ");

                prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("look out")) {
                    System.out.println("You choose to " + prompt + "the wondow. Enjoy it. And don't stay too long.");
                } else if (prompt.equalsIgnoreCase("eat")) {
                    System.out.println("You choose to start to " + prompt + ". Enjoy eating now.");
                } else {
                    System.out.println(" You did not give the right choice. You should make the right selection next time");

                }
            } else {
                System.out.println(" You didn't select the right choice. You should make the right selection the next time");
            }
            System.out.println();
        }else if (prompt.equalsIgnoreCase("basement")){
                System.out.println("You choose to go to " + prompt+". Would you like go to (turn on) the lights or (walk) in the dark?: ");

            prompt = keyboard.nextLine();
            if (prompt.equalsIgnoreCase("turn on")){
                System.out.println(" You choose to " + prompt + " the the lights. Would you like to the (laundary) on or tun the lights (off)?: ");

            prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("laundary")){
                    System.out.println("You choose to tun " + prompt + "on. Watchout your steps anyway.");
                }
                else if (prompt.equalsIgnoreCase("off")){
                    System.out.println("You choose to turn the lights " + prompt+". While coming back watch your steps.");
                }
                else
                {System.out.println(" You did not give the right choices. You should make the right selection");
                }}
            else if (prompt.equalsIgnoreCase("walk")){
                System.out.println(" You choose to " + prompt + " in the dark. Before you go for the " + prompt +", would you like to open a (chest) or a (closet)?: ");

            prompt = keyboard.nextLine();
                if (prompt.equalsIgnoreCase("chest")){
                    System.out.println("You choose to open a " + prompt + ". Please slowly open it.");
                }
                else if (prompt.equalsIgnoreCase("closet")){
                    System.out.println("You choose to open a " + prompt+". Please close it fast.");
                }
                else
                {System.out.println(" You did not give the right choices. You should make the right selection");
                }}
				else
            {System.out.println(" You did not give the right choices. You should make the right selection next time");
            }}
		else
            {System.out.println(" You did not give the right choices. You should make the right selection next time.");
            }
        }
    }
