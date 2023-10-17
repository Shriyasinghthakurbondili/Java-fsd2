package com.app.junitDemo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)

@SelectClasses({com.app.junitDemo.IncludeExcludeTags.class})
@IncludeTags({"qa"})
public class JunitRunner {

}
