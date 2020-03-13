import { Injectable } from '@angular/core';
import{Task} from '../models/task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  tasks:Task[];

  constructor() {
    this.tasks=[
      {taskId:1,taskName:"create",startDate:new Date("2010-03-23"),endDate:new Date("2012-04-24")},
      {taskId:1,taskName:"alter",startDate:new Date("2012-03-23"),endDate:new Date("2016-04-24")},
      {taskId:1,taskName:"drop",startDate:new Date("2011-03-23"),endDate:new Date("2015-04-24")},
    ];
   }
   getAll():Task[]{
     return this.tasks;
   }
   get(id:number){
     return this.tasks.find((t)=>(t.taskId==id));
   }
   add(task:Task){
     this.tasks.push(task);
   }
   update(task:Task){
     let index=this.tasks.findIndex((t)=>(t.taskId==task.taskId));
     if(index>-1){
       this.tasks[index]=task;
     }
   }
   delete(id:number){
     let index=this.tasks.findIndex((task)=>(task.taskId==id));
     if(index>-1){
       this.tasks.splice(index,1);
     }
   }
}
