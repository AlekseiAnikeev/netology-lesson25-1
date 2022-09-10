package ru.agentche.service;

import ru.agentche.db.Db;
import ru.agentche.db.DbSetting;
import ru.agentche.db.entity.MyEntity;

import java.util.UUID;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 10.09.2022
 */
public class MyService {

    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}
