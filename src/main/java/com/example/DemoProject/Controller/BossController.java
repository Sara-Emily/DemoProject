package com.example.DemoProject.Controller;

import com.example.DemoProject.Model.Boss;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BossController {

    @GetMapping("/boss")
    public List<Boss> getAllBoss() {

        List<Boss> bossList = new ArrayList<Boss>();

        // Returns hardcoded data, a real application will return data from a database
        // that will be deployed to a server (virtual machine)
        bossList.add(new Boss(1, "Tomas", 22));
        bossList.add(new Boss(47, "Emina", 21));
        bossList.add(new Boss(420, "Anoop", 22));
        bossList.add(new Boss(10, "Boss2", 122));
        bossList.add(new Boss(10, "Boss2", 80));
        bossList.add(new Boss(2, "Baby Boss", 12));

        return bossList;
    }

    @GetMapping("boss/{bossID}")
    public Boss getBossWithID(@PathVariable Integer bossID) {

        // Returns hardcoded data, a real application will return data from a database
        return new Boss(3,"Mr Bean", 44);
    }

    @PostMapping("/boss/newBoss") // Uses POST method
    public void addPerson(@RequestBody Boss boss) {

        // Returns hardcoded data, a real application will return data from a database
        // that will be deployed to a server (virtual machine)
        System.out.println("Saving Boss information to the database");
    }
}
