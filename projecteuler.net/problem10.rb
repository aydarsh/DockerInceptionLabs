require "prime"

def sum_of_primes_below n
	Prime.each(n).reduce(:+)	
end

p sum_of_primes_below 2_000_000
