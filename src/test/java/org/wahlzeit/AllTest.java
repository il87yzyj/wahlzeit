package org.wahlzeit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.wahlzeit.handlers.TellFriendTest;
import org.wahlzeit.model.*;
import org.wahlzeit.model.persistence.*;
import org.wahlzeit.services.*;
import org.wahlzeit.utils.StringUtilTest;
import org.wahlzeit.utils.VersionTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	TellFriendTest.class, 
	AbstractAdapterTest.class,
	DatastoreAdapterTest.class,
	AccessRightsTest.class, 
	FlagReasonTest.class,
	GenderTest.class, 
	GuestTest.class, 
	PhotoFilterTest.class, 
	TagsTest.class, 
	UserStatusTest.class, 
	ValueTest.class,
	EmailServiceTestSuite.class,
	LogBuilderTest.class, 
	StringUtilTest.class, 
	VersionTest.class 
	})

public class AllTest {

}
