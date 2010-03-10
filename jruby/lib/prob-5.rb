require 'rubygems'
puts "The answer is: #{(1..20).inject(1) { |least_common, num| least_common.lcm num }}"
