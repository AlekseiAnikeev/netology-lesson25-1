package ru.agentche.api;

import ru.agentche.db.entity.MyEntity;
import ru.agentche.service.MyService;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 10.09.2022
 */
public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}
