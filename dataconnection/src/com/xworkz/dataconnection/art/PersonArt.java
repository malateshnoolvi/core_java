package com.xworkz.dataconnection.art;

import com.xworkz.dataconnection.dto.PersonDTO;
import com.xworkz.dataconnection.service.PersonService;
import com.xworkz.dataconnection.serviceimpl.PersonServiceImpl;

public class PersonArt {

	public static void main(String[] args) {

		PersonDTO person1 = new PersonDTO(1, "Malatesh", "malatesh.xworkz@gmail.com", 8073480740l, "male", "BE", false,
				false, "infosys", 25000, 23, 1, "kusugal", "hubli", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 647851247104l);
		PersonDTO person2 = new PersonDTO(2, "Manoj", "manoj.xworkz@gmail.com", 7204250720l, "male", "BE", false, false,
				"infosol", 24000, 24, 3, "huligerepura", "maddur", "karnataka", "india", 72056447873441l, "bfdpj4025h",
				true, 203547894620l);
		PersonDTO person3 = new PersonDTO(3, "Basavaraj", "basavaraj.xworkz@gmail.com", 9036650757l, "male", "M.sc",
				false, false, "trempplin", 23000, 27, 2, "kc road", "gadag", "karnataka", "india", 246875214620l,
				"khgdh5620g", true, 698521478512l);
		PersonDTO person4 = new PersonDTO(4, "Abhishek", "abhishek.xworkz@gmail.com", 9036924698l, "male", "BE", false,
				false, "infosys", 26000, 27, 2, "despandenagar", "hubli", "karnataka", "india", 59927190500l,
				"khytd45802k", true, 786549247812l);
		PersonDTO person5 = new PersonDTO(5, "Raghavendra", "raghavendra.xworkz@gmail.com", 9785476248l, "male", "BE", false,
				false, "tcs", 23000, 29, 3, "gandhicircle", "gadag", "karnataka", "india", 874569120474l, "bilin4263j",
				true, 457981247624l);
		PersonDTO person6 = new PersonDTO(6, "Darshan", "darshan.xworkz@gmail.com", 9745861476l, "male", "BE", false,
				false, "boss", 29000, 23, 1, "stationroad", "channnapatnna", "karnataka", "india", 245789642014l, "dewar5402k",
				true, 644578201104l);
		PersonDTO person7 = new PersonDTO(7, "Prajwal", "prajwal.xworkz@gmail.com", 9782456187l, "male", "BE", false,
				false, "light", 28000, 25, 2, "hosur", "hubli", "karnataka", "india", 47896587210l, "fertj4580j",
				true, 457896321478l);
		PersonDTO person8 = new PersonDTO(8, "chandru", "chandru.xworkz@gmail.com", 8970816064l, "male", "BE", false,
				false, "wipro", 27000, 24, 1, "aralikatte", "channagiri", "karnataka", "india", 436337588896l, "biapc0441g",
				true, 35870847504l);
		PersonDTO person9 = new PersonDTO(9, "dada", "dada.xworkz@gmail.com", 9648751048l, "male", "BE", true,
				false, "deloitte", 25000, 28, 2, "mudhool", "hubli", "karnataka", "india", 852147963104l, "bgfdf4502j",
				true, 78541256904l);
		PersonDTO person10 = new PersonDTO(10, "dyamanna", "dyamanna.xworkz@gmail.com", 7569841280l, "male", "BE", false,
				false, "accenture", 28000, 23, 3, "jamkhandi", "baglakot", "karnataka", "india", 975846752012l, "trewa2354y",
				true, 47586920145l);
		PersonDTO person11 = new PersonDTO(11, "sachin", "sachin.xworkz@gmail.com", 8012456587l, "male", "BE", false,
				false, "ibm", 25000, 30, 3, "rmroad", "ramdurga", "karnataka", "india", 547812901248l, "edfra6540k",
				true, 85014937510l);
		PersonDTO person12 = new PersonDTO(12, "sharath", "sharath.xworkz@gmail.com", 8972156104l, "male", "BE", false,
				false, "capgemini", 26000, 25, 1, "malavalli", "mandya", "karnataka", "india", 568874412661l, "whtfo5482y",
				true, 647851247104l);
		PersonDTO person13 = new PersonDTO(13, "divya", "divya.xworkz@gmail.com", 8577669018l, "female", "BE", false,
				false, "ibm", 24000, 26, 1, "cjroad", "chittradurga", "karnataka", "india", 447892157910l, "ghgvh5442j",
				true, 545425435212l);
		PersonDTO person14 = new PersonDTO(14, "naresh", "naresh.xworkz@gmail.com", 8073480740l, "male", "BCA", false,
				false, "tcs", 25000, 24, 3,"pavgada" , "tumakur", "karnataka", "india", 268849906344l, "rtewa5465z",
				true, 47590225422l);
		PersonDTO person15 = new PersonDTO(15, "santosh", "santosh.xworkz@gmail.com", 9088755420l, "male", "BE", false,
				false, "deloitte", 29000, 29, 1, "durganagar", "chikkamaglur", "karnataka", "india", 456462332312l, "sfteg4580g",
				true, 54654335435l);
		PersonDTO person16 = new PersonDTO(16, "kalyankumar", "kalyankumar.xworkz@gmail.com", 9853513001l, "male", "BE", false,
				false, "accenture", 24000, 25, 2, "tbnagar", "tumakur", "karnataka", "india", 448782147963l, "werti5478p",
				true, 75558974562l);
		PersonDTO person17 = new PersonDTO(17, "sharan", "sharan.xworkz@gmail.com", 9087456204l, "male", "BE", false,
				false, "tempplin", 28000, 25, 3, "beachroad", "batkal", "karnataka", "india", 268849906344l, "brtew6874p",
				true, 65365343543l);
		PersonDTO person18 = new PersonDTO(18, "pankaj", "pankaj.xworkz@gmail.com", 8962224577l, "male", "BE", false,
				false, "infosol", 26000, 26, 3, "courtroad", "sirsi", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 435436433630l);
		PersonDTO person19 = new PersonDTO(19, "nagesh", "nagesh.xworkz@gmail.com", 7845559871l, "male", "BE", false,
				false, "capgemini", 24000, 24, 1, "jamkhandi", "baglakote", "karnataka", "india", 456255458562l, "rtyuh4520k",
				true, 457896212577l);
		PersonDTO person20 = new PersonDTO(20, "vidya", "vidya.xworkz@gmail.com", 8741258045l, "female", "BE", false,
				false, "wipro", 26000, 25, 2, "kalghatagi", "hubli", "karnataka", "india", 268844535635l, "biasf4578v",
				true, 787744552361l);
		PersonDTO person21 = new PersonDTO(21, "hanumanth", "hanumanth.xworkz@gmail.com", 8765465120l, "male", "BE", false,
				false, "infosys", 28000, 26, 3, "badami", "bagalkote", "karnataka", "india", 268849906344l, "ydhgg6844e",
				true, 984654654985l);
		PersonDTO person22 = new PersonDTO(22, "nandan", "nandan.xworkz@gmail.com", 7845515541l, "female", "BE", true,
				false, "accenture", 29000, 24, 2, "rtroad", "mandya", "karnataka", "india", 782395145618l, "iutre4578n",
				true, 64862653352l);
		PersonDTO person23 = new PersonDTO(23, "arjun", "arjun.xworkz@gmail.com", 9874512450l, "female", "BE", false,
				false, "cms", 27000, 25, 1, "ayodyanagar", "laknow", "uttarpradesh", "india", 486825741256l, "werds78520k",
				true, 587565645656l);
		PersonDTO person24 = new PersonDTO(24, "manohar", "manohar.xworkz@gmail.com", 7854123608l, "male", "BE", false,
				false, "capgemini", 25000, 27, 2, "kgfroad", "kolar", "karnataka", "india", 688656566546l, "klsio7802g",
				true, 658745100105l);
		PersonDTO person25 = new PersonDTO(25, "suhash", "suhash.xworkz@gmail.com", 9956562655l, "male", "BE", false,
				false, "tvs", 24000, 26, 3, "anvatti", "shivamogga", "karnataka", "india", 5468898669669l, "hhjho2665d",
				true, 986855656984l);

		PersonService service = new PersonServiceImpl();
		System.out.println(service.validAndSave(person1));
		System.out.println(service.validAndSave(person2));
		System.out.println(service.validAndSave(person3));
		System.out.println(service.validAndSave(person4));
		System.out.println(service.validAndSave(person5));
		System.out.println(service.validAndSave(person6));
		System.out.println(service.validAndSave(person7));
		System.out.println(service.validAndSave(person8));
		System.out.println(service.validAndSave(person9));
		System.out.println(service.validAndSave(person10));
		System.out.println(service.validAndSave(person11));
		System.out.println(service.validAndSave(person12));
		System.out.println(service.validAndSave(person13));
		System.out.println(service.validAndSave(person14));
		System.out.println(service.validAndSave(person15));
		System.out.println(service.validAndSave(person16));
		System.out.println(service.validAndSave(person17));
		System.out.println(service.validAndSave(person18));
		System.out.println(service.validAndSave(person19));
		System.out.println(service.validAndSave(person20));
		System.out.println(service.validAndSave(person21));
		System.out.println(service.validAndSave(person22));
		System.out.println(service.validAndSave(person23));
		System.out.println(service.validAndSave(person24));
		System.out.println(service.validAndSave(person25));
		
		
		
		
		
	}

}
