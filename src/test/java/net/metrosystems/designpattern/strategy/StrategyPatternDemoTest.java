package net.metrosystems.designpattern.strategy;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StrategyPatternDemoTest {
	@Test
	public void OperationAddTest(){
		Context context = new Context(new OperationAdd());
		assertEquals(15,context.executeStrategy(10, 5));
	}
	@Test
	public void OperationSubstractTest(){
		Context context = new Context(new OperationSubstract());
		assertEquals(5,context.executeStrategy(10, 5));
	}
	@Test
	public void OperationMultiplyTest(){
		Context context = new Context(new OperationMultiply());
		assertEquals(50,context.executeStrategy(10, 5));
	}
}
