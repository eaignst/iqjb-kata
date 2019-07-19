/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.streams1;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 *
 * @author avincze
 */
public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        
        
         // Query 1: Find all transactions from year 2011 
        // and sort them by value (small to high).
        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)
                        .reversed())
                .collect(toList());
        System.out.println(tr2011);

        // Query 2: What are all the unique cities where 
        // the traders work?
        List<String> cities
                = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        
        Set<String> cities2
                = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());
        System.out.println(cities);
        
        //good solution
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        
        //
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList())
                .forEach(System.out::println);
        
        
        // Query 3: Find all traders from Cambridge and 
        // sort them by name.
        List<Trader> traders
                = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(traders);

        // Query 4: Return a string of all traders’ names 
        // sorted alphabetically.
        String traderStr
                = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1.concat(n2) + " ");
                
        String traderStr2
                = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(traderStr);

        // Query 5: Are there any trader based in Milan?
        boolean milanBased
                = transactions.stream()
                .anyMatch( transaction -> "Milan".equals(transaction.getTrader()
                        .getCity())
                );
        System.out.println(milanBased);

        // Query 6: Print all transactions values.
        transactions.stream()
                //.map(Transaction::getTrader)
                .filter(trans -> trans.getTrader().getCity().equals("Cambridge"))
                .forEach(trans -> System.out.println(trans.getValue()));
        System.out.println(transactions);

        // Query 7: What's the highest value in 
        // all the transactions?
        transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .ifPresent(System.out::println);

        // Query 8: Find the transaction 
        // with the smallest value
        Optional<Transaction> smallestTransaction
                = transactions.stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallestTransaction.isPresent());
        
        Optional<Transaction> other = Optional.empty();
        
        smallestTransaction.ifPresent(System.out::println);
        other.ifPresent(System.out::println);

        
        
        
        
    }

}
