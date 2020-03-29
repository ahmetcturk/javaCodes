package week81;

abstract class File {
	 String name;
	public File() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File(String name) {
		super();
		this.name = name;
	}
	abstract void open(); 
	void close(){
		
	}

	}
	 class XLSFile extends File {
	public XLSFile() {
		// TODO Auto-generated constructor stub
	}


		@Override
		void open() {
			// TODO Auto-generated method stub
			
		}
	    
	}
	 class PDFFile extends File{
		 public PDFFile() {
		// TODO Auto-generated constructor stub
		 }
		public PDFFile(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		void open() {
			// TODO Auto-generated method stub
			
		}
	    
	}
	 
	 class JPGFile extends File{

		@Override
		void open() {
			// TODO Auto-generated method stub
			
		}
		 
	 }

	public class AbstractTester4 {
	    public static void main(String[] args) {
	        //File file1 = new File(); will not work, cannot create object
	        XLSFile xl = new XLSFile();
	        xl.open();
	        xl.close();
	        xl.setName("TestData.xls");
	        System.out.println("XLS file name: " + xl.getName());
	         
	        JPGFile jpg = new JPGFile();
	        jpg.setName("Event01.jpg");
	        jpg.open();
	        jpg.close();
	        System.out.println("JPG file name: " + jpg.getName());
	         
	       
	         
	        PDFFile pdf = new PDFFile("AgileBook.pdf");
	        pdf.open();
	        pdf.close();
	         
	       
	         
	    }
	 
	}

