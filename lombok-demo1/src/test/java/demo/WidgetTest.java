package demo;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WidgetTest {

	@Test
	void test() {
		Widget testWidget = Widget.builder()
				  .name("foo")
				  .id(1)
				  .build();
		
		assertTrue("foo".equals(testWidget.getName()));
		assertTrue(1 == testWidget.getId());

	}

}
