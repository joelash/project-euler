load File.dirname(__FILE__) + '/primes.rb'

def prob_10
  Prime.new.take_while { |prime| prime < 2_000_000 }.inject(0) { |accum, x| accum + x }
end

puts "The total is: #{prob_10}"
