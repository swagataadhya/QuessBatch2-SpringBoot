package com.Prograd.HelloWorldDemo.HelloWorldController;
import com.Prograd.HelloWorldDemo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
@GetMapping("/helloworld")
    public String hello(){
    return "Name-Swagata Adhya <br> Hello All!";
    }
    @GetMapping("/test/{mydata}")
    public String getData(@PathVariable(name="mydata")String data)
    {
        return data;
    }
    @GetMapping("/employee/{name}/{age}/{designation}")
    public Employee getData(@PathVariable(name="name")String name,
                            @PathVariable(name="age")int x,
                            @PathVariable(name="designation")String dsg)
    {
        return new Employee(name,x,dsg);
    }
    @GetMapping("/practice/{name}/{age}/{designation}")
    public Employee myPractice(@PathVariable(name="name")String name,
                               @PathVariable(name="age")String age,
                               @PathVariable(name="designation")String dsg)
    {
        return new Employee(name,Integer.parseInt(age),dsg);
    }
    @GetMapping("/open_me/{designation}")
    Employee getRequest(@PathVariable(name = "designation")String dsg,
            @RequestParam(name = "name")String name,
                      @RequestParam(name = "age")int age)
    {
        return new Employee(name,age,dsg);
    }

    @GetMapping("/getcall")
    public String getMyData(@RequestParam(name="fname")String fname,
                            @RequestParam(name="lname")String lname)
    {
        return "Hello "+fname+" "+lname;
    }

}
