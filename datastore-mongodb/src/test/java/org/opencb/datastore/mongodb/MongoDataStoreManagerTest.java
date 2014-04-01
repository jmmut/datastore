package org.opencb.datastore.mongodb;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by imedina on 27/03/14.
 */
public class MongoDataStoreManagerTest {

    private MongoDataStoreManager mongoDataStoreManager;

    @Before
    public void setUp() throws Exception {
        mongoDataStoreManager = new MongoDataStoreManager("127.0.0.1", 27017);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGet() throws Exception {
        MongoDataStore mongoDataStore = mongoDataStoreManager.get("test", MongoDBConfiguration.builder().init().build());
        Assert.assertTrue("MongoDB check connection to 'test' database failed", mongoDataStore.test());
    }
}
