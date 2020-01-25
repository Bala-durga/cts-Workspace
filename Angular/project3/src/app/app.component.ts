import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private message:string=null;
  private version:number=null;
  private topics:string[]=null;
  private index:number=null;
  public constructor(){
    this.message="welcome";
    this.version=8;
    this.topics=['data binding','forms','HTML','Routing'];
  }
  public addTopic(currentTopic:string):boolean{
    for(var topic of this.topics){
    if(currentTopic==topic){
      alert('this is already present');
      return false;
    }
    }
      if(currentTopic.length==0){
      alert("cannot add empty cell");
      return false;
    }
    this.topics.push(currentTopic);
  
  }
  public deleteTopic(index:number):void{
   this.topics.splice(index,1);
  }
  public deleteTopicName(currentTopic:string):void{
    for(var topic of this.topics){
      if(currentTopic==topic){
        this.index=this.topics.indexOf(currentTopic)
        this.topics.splice(this.index,1)
      }
    }
    alert("item is deleted")
  }
  public searchTopic(currentTopic:string):void{
    for(var topic of this.topics)
    if(currentTopic==topic){
      this.index=this.topics.indexOf(currentTopic);
      alert("topic present at"+(this.index+1));
    }
  }


    
  }

