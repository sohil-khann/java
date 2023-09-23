package car_showroom.java;
import java.util.Scanner;
public class car_showroom {

	
	
		public static void  main(String[] args) {
		
			Scanner sc = new Scanner(System.in) ;
		
		System.out.println(" Welcome to our showroom \n\n "
				+ "Thank you for visiting us..\n \n"
				+ "");
		System.out.print("Enter the type of vehicle 2/4 wheeler  : ");	
		int w=sc.nextInt();
		
	if(w==4) {	
		System.out.print("Please enter your car name that you want : 'BOLERO','XUV 700' ,'THAR'  : ");

		sc = new Scanner(System.in) ;
		String car_name=sc.nextLine();
		switch(car_name){
		           
		
		case "BOLERO":
			
			
			System.out.println("Key Specifications of Mahindra Bolero\r\n\n"
					+ "ARAI Mileage : 16.0 kmplCity \n "
					+ "Mileage : 15.64 kmplFuel \n "
					+ "TypeDieselEngine Displacement : (cc)1493 \n "
					+ "No. of cylinder : 3 \n "
					+ "Max Power (bhp@rpm) : 74.96bhp@3600rpm  \n "
					+ "Max Torque (nm@rpm) : 210Nm@1600-2200rpmSeating \n"
					+ " Capacity  : 7 \n "
					+ "TransmissionType : Manual \n "
					+ "Fuel Tank Capacity : 60 \n ."
					+ "Body Type : SUV");
			
		case "THAR":
			System.out.println("Key Specifications of Mahindra THAR\n\n"
					+ "ARAI Mileage : 9 kmplCity \n "
					+ "Mileage : 9 kmplFuel \n "
					+ "TypeDieselEngine Displacement : (cc) 2184 \n "
					+ "No. of cylinder : 4 \n "
					+ "Max Power (bhp@rpm) : 130bhp@3700rpm  \n "
					+ "Max Torque (nm@rpm) : 300Nm@1600-2800rpmSeating \n"
					+ " Capacity  : 4 \n "
					+ "TransmissionType : Manual \n "
					+ "Fuel Tank Capacity : 57 \n ."
					+ "Body Type : SUV");
			
			
		case "XUV 700":
			System.out.println("City Mileage : 17.19 kmpl \n \n"
					+ ""
					+ "Fuel Type : Diesel \n "
					+ "Engine Displacement : (cc)2198 \n "
					+ "No. of cylinder : 4  \n "
					+ "Max Power (bhp@rpm) : 182.38bhp@3500 \n "
					+ "rpmMax Torque (nm@rpm) : 450Nm@1750-2800rpm \n "
					+ "Seating Capacity  : 5,7 \n "
					+ "TransmissionType : Automatic \n "
					+ "Body Type  : SUV");
		
		 
		}
		
		
		
	}
	Scanner b=new Scanner(System.in);
	
	if(w==2){
	System.out.print("please enter your bike name : 'pulser NS160 ' , 'apache 160' , 'bullet 350' : ");
	String b_=b.nextLine();
	switch(b_) {
	        
	case "pulser NS160":
		System.out.println("great nice choice \n here are the specs : \n "+"Pulsar NS160 key highlights\r\n"
			+ "Engine Capacity\r\n"
			+ "160.3 cc\r\n"
			+ "Mileage - ARAI\r\n"
			+ "52.2 kmpl\r\n"
			+ "Transmission\r\n"
			+ "5 Speed Manual\r\n"
			+ "Kerb Weight\r\n"
			+ "152 kg\r\n"
			+ "Fuel Tank Capacity\r\n"
			+ "12 litres\r\n"
			+ "Seat Height\r\n"
			+ "805 mm");
	case "apche 160":
		System.out.println(" Specifications\r\n"
			+ "Power & Performance\r\n"
			+ "\r\n"
			+ "Displacement\r\n"
			+ "159.7 cc\r\n"
			+ "Max Power\r\n"
			+ "15.82 bhp @ 8750 rpm\r\n"
			+ "Max Torque\r\n"
			+ "13.85 Nm @ 7000 rpm\r\n"
			+ "Mileage - ARAI\r\n"
			+ "61 kmpl\r\n"
			+ "Mileage - Owner Reported\r\n"
			+ "45 kmpl\r\n"
			+ "Riding Range\r\n"
			+ "540 Km\r\n"
			+ "Top Speed\r\n"
			+ "107 Kmph\r\n"
			+ "Transmission\r\n"
			+ "5 Speed Manual\r\n"
			+ "Transmission Type\r\n"
			+ "Chain Drive\r\n"
			+ "Gear Shifting Pattern\r\n"
			+ "1 Down 4 Up\r\n"
			+ "Cylinders\r\n"
			+ "1\r\n"
			+ "Bore\r\n"
			+ "62 mm\r\n"
			+ "Stroke\r\n"
			+ "52.9 mm\r\n"
			+ "Valves Per Cylinder\r\n"
			+ "2\r\n"
			+ "Compression Ratio\r\n"
			+ "10.0:1\r\n"
			+ "Ignition\r\n"
			+ "CDI\r\n"
			+ "Spark Plugs\r\n"
			+ "1 Per Cylinder\r\n"
			+ "Cooling System\r\n"
			+ "Air Cooled\r\n"
			+ "Clutch\r\n"
			+ "Wet Multiplate\r\n"
			+ "Fuel Delivery System\r\n"
			+ "Fuel Injection\r\n"
			+ "Fuel Tank Capacity\r\n"
			+ "12 litres\r\n"
			+ "Reserve Fuel Capacity\r\n"
			+ "2.5 litres\r\n"
			+ "Emission Standard\r\n"
			+ "BS6\r\n"
			+ "Fuel Type\r\n"
			+ "Petrol\r\n"
			+ "Collapse\r\n"
			+ "\r\n"
			+ "Brakes, Wheels & Suspension\r\n"
			+ "\r\n"
			+ "Front Suspension\r\n"
			+ "Telescopic with Hydraulic Dampers. 105mm Stroke\r\n"
			+ "Rear Suspension\r\n"
			+ "Monotube Inverted Gas-filled shox (MIG) with spring aid\r\n"
			+ "Braking System\r\n"
			+ "Single Channel ABS\r\n"
			+ "Front Brake Type\r\n"
			+ "Disc\r\n"
			+ "View More(+15)\r\n"
			+ "\r\n"
			+ "Dimensions & Chassis\r\n"
			+ "\r\n"
			+ "Kerb Weight\r\n"
			+ "137 kg\r\n"
			+ "Seat Height\r\n"
			+ "790 mm\r\n"
			+ "Ground Clearance\r\n"
			+ "180 mm\r\n"
			+ "Overall Length\r\n"
			+ "2085 mm\r\n"
			+ "View More(+4)\r\n"
			 + "\r\n"
			+ "Manufacturer Warranty\r\n"
			+ "\r\n"
			+ "Standard Warranty\r\n"
			+ "5 Year\r\n"
			+ "Standard Warranty\r\n"
			+ "60000 Km\r\n"
			+ "Service & Maintenance Schedule\r\n"
			+ "\r\n"
			+ "1st Service\r\n"
			+ "500-750 Kms/30 Days\r\n"
			+ "2nd Service\r\n"
			+ "2500-3000 Kms/90 Days\r\n"
			+ "3rd Service\r\n"
			+ "5000-6000 Kms/180 Days\r\n"
			+ "4th Service\r\n"
			+ "8500-9000 Kms/270 Days");
	case "bullet 350":
		System.out.println("Specifications\r\n"
			+ "Power & Performance\r\n"
			+ "\r\n"
			+ "Displacement\r\n"
			+ "346 cc\r\n"
			+ "Max Power\r\n"
			+ "19.1 bhp @ 5250 rpm\r\n"
			+ "Max Torque\r\n"
			+ "28 Nm @ 4000 rpm\r\n"
			+ "Mileage - ARAI\r\n"
			+ "-\r\n"
			+ "Mileage - Owner Reported\r\n"
			+ "38 kmpl\r\n"
			+ "Riding Range\r\n"
			+ "513 Km\r\n"
			+ "Top Speed\r\n"
			+ "110 Kmph\r\n"
			+ "Transmission\r\n"
			+ "5 Speed Manual\r\n"
			+ "Transmission Type\r\n"
			+ "Chain Drive\r\n"
			+ "Gear Shifting Pattern\r\n"
			+ "1 Down 4 Up\r\n"
			+ "Cylinders\r\n"
			+ "1\r\n"
			+ "Bore\r\n"
			+ "70 mm\r\n"
			+ "Stroke\r\n"
			+ "90 mm\r\n"
			+ "Valves Per Cylinder\r\n"
			+ "2\r\n"
			+ "Compression Ratio\r\n"
			+ "8.5 : 1\r\n"
			+ "Ignition\r\n"
			+ "CDI\r\n"
			+ "Spark Plugs\r\n"
			+ "1 Per Cylinder\r\n"
			+ "Cooling System\r\n"
			+ "Air Cooled\r\n"
			+ "Clutch\r\n"
			+ "Wet Multiplate\r\n"
			+ "Fuel Delivery System\r\n"
			+ "Fuel Injection\r\n"
			+ "Fuel Tank Capacity\r\n"
			+ "13.5 litres\r\n"
			+ "Reserve Fuel Capacity\r\n"
			+ "2.5 litres\r\n"
			+ "Emission Standard\r\n"
			+ "BS6\r\n"
			+ "Fuel Type\r\n"
			+ "Petrol\r\n"
			+ "Collapse\r\n"
			+ "\r\n"
			+ "Brakes, Wheels & Suspension\r\n"
			+ "\r\n"
			+ "Front Suspension\r\n"
			+ "Telescopic, 35 mm forks, 130 mm travel\r\n"
			+ "Rear Suspension\r\n"
			+ "Twin shock absorbers with 5 step adjustable preload, 80 mm travel\r\n"
			+ "Braking System\r\n"
			+ "Single Channel ABS\r\n"
			+ "Front Brake Type\r\n"
			+ "Disc\r\n"
			+ "View More(+15)\r\n"
			+ "\r\n"
			+ "Dimensions & Chassis\r\n"
			+ "\r\n"
			+ "Kerb Weight\r\n"
			+ "191 kg\r\n"
			+ "Seat Height\r\n"
			+ "800 mm\r\n"
			+ "Ground Clearance\r\n"
			+ "135 mm\r\n"
			+ "Overall Length\r\n"
			+ "2170 mm\r\n"
			+ "View More(+4)\r\n"
			+ "\r\n"
			+ "Manufacturer Warranty\r\n"
			+ "\r\n"
			+ "Standard Warranty\r\n"
			+ "3 Year\r\n"
			+ "Standard Warranty\r\n"
			+ "30000 Km");
	
	
	}
		
	}
		}
		
	}


