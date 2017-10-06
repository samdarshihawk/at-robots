/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Set;
import net.virtualinfinity.atrobots.arena.SimulationFrameBuffer;
import net.virtualinfinity.atrobots.gui.RobotStatusPane;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RobotStatusPaneEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      assertNotNull(robotStatusPane0);
      
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      robotStatusPane0.frameAvailable(simulationFrameBuffer0);
      assertEquals("net.virtualinfinity.atrobots.gui.RobotStatusPane[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=99,fixedCellWidth=289,horizontalScrollIncrement=-1,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],visibleRowCount=8,layoutOrientation=0]", robotStatusPane0.toString());
      assertEquals(289, robotStatusPane0.getFixedCellWidth());
  }

  @Test
  public void test1()  throws Throwable  {
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      assertNotNull(robotStatusPane0);
      
      robotStatusPane0.reset();
      assertEquals("net.virtualinfinity.atrobots.gui.RobotStatusPane[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=99,fixedCellWidth=289,horizontalScrollIncrement=-1,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],visibleRowCount=8,layoutOrientation=0]", robotStatusPane0.toString());
      assertEquals(289, robotStatusPane0.getFixedCellWidth());
  }

  @Test
  public void test2()  throws Throwable  {
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      assertNotNull(robotStatusPane0);
      
      Set<Integer> set0 = robotStatusPane0.getSelectedRobotIds();
      assertNotNull(set0);
      assertEquals(289, robotStatusPane0.getFixedCellWidth());
      assertEquals("net.virtualinfinity.atrobots.gui.RobotStatusPane[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=50331944,maximumSize=,minimumSize=,preferredSize=,fixedCellHeight=99,fixedCellWidth=289,horizontalScrollIncrement=-1,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],visibleRowCount=8,layoutOrientation=0]", robotStatusPane0.toString());
  }
}