package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exception.TrainException;
import TicketBean.BookTicket;
import TicketBean.Passenger;
import dao.PassengerDaoImpl;

public class PassengerServiceImpl implements IPassengerService {

	@Override
	public BookTicket Book_ticket(Passenger pr) throws ClassNotFoundException, SQLException, IOException {
		PassengerDaoImpl dao=new PassengerDaoImpl ();
		BookTicket bt=new BookTicket();
		bt=dao.Book_ticket(pr);
		return bt;
	}

	@Override
	public String cancel_ticket(Passenger pr) {
		//
		return null;
	}

	@Override
	public String add_Train(Passenger pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validatePassenger(Passenger pr) throws TrainException {
		// TODO Auto-generated method stub
List<String> validationErrors=new ArrayList<String>();
		
		if(!(isValidPassengerName(pr.getPassengerName()))) {
			validationErrors.add("Train name should be in alphabets and 10 characters long");
		}
		if(!(isvalidSource(pr.getSource()))){
			validationErrors.add("Source should be greater than 5 characters ");
		}
		if(!(isvalidDestination(pr.getDestination()))) {
			validationErrors.add("Destination should be greater than 5 characters ");
		}
		if(!(isvalidSource(pr.getMailId()))){
			validationErrors.add("should be greater than 20 characters");
		}
		if(!validationErrors.isEmpty())
			throw new TrainException(validationErrors+" ");
			
		
	}

	private boolean isvalidDestination(String destination) {
		Pattern destPattern =Pattern .compile("^[A-Za-z]{5,}$");
		Matcher destMatcher=destPattern.matcher(destination);
		return destMatcher.matches();
		
	}

	private boolean isvalidSource(String source) {
		// TODO Auto-generated method stub
		Pattern sourcePattern =Pattern .compile("^[A-Za-z]{5,}$");
		Matcher sourceMatcher=sourcePattern.matcher(source);
		return sourceMatcher.matches();
	}

	private boolean isValidPassengerName(String passengerName) {
		Pattern passengerNamePattern =Pattern .compile("^[A-Za-z]{5,}$");
		Matcher passengerNameMatcher=passengerNamePattern.matcher(passengerName);
		return passengerNameMatcher.matches();
	}
	}


