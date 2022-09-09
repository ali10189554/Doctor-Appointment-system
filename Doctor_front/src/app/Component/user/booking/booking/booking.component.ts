import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgbDate } from '@ng-bootstrap/ng-bootstrap';
import { BookingService } from 'src/app/Services/booking.service';
import { LocationService } from 'src/app/Services/location.service';
import { LoginService } from 'src/app/Services/login.service';
import { UserService } from 'src/app/Services/user.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  user=this.login.getUser();
  public location:any;
  charge:any;
  public book={
    userId:this.user.id,
    pickup_location:'',
    dropof_location:'',
    date:'',
    month:'',
    year:'',
    hour:'',
    min:'',
    period:'',
    comment:''
  }
 



  constructor(private users:UserService , private login:LoginService , private loc:LocationService , private booking:BookingService,
              private router:Router) { }

  ngOnInit(): void {
    this.loc.getAllLocation().subscribe(
      (data:any)=>{
         this.location=data;  
      },
      (error)=>{

      }
    );
  }

  onSubmit(){
    this.booking.addBooking(this.book).subscribe(
      (data:any)=>{
         console.log(data);
         this.router.navigate(['/user/bookingSuccess/', data.id]);
         
      },
      (error:any)=>{

      }
    )
  }

 
}