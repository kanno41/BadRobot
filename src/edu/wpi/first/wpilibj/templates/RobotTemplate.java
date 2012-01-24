/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Watchdog;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.templates.buttons.FireTrigger;
import edu.wpi.first.wpilibj.templates.commands.*;
=======
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.MecanumDrive;
>>>>>>> f242af576b25aa402d429afdbfac2cd6fc371a8c

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit()
    {
        // Initialize all subsystems
        CommandBase.init();
        // instantiate the command used for the autonomous period
        autonomousCommand = new MecanumDrive();
    }

    public void autonomousInit()
    {
        Scheduler.getInstance().add(autonomousCommand);
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();


    }

<<<<<<< HEAD
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
	// teleop starts running. If you want the autonomous to 
	// continue until interrupted by another command, remove
	// this line or comment it out.
        autonomousCommand.start();
=======
    public void teleopInit()
    {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to 
		// continue until interrupted by another command, remove
		// this line or comment it out.
                Scheduler.getInstance().add(autonomousCommand);

>>>>>>> f242af576b25aa402d429afdbfac2cd6fc371a8c
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() 
    {
        Watchdog.getInstance().feed();
        Scheduler.getInstance().run();         
    }
}
