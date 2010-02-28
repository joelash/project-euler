#!/usr/bin/env jruby

class Fixnum
  def multiple?(num)
    self % num == 0
  end
end

total = 0
(1...1000).each do |num|
  if num.multiple?(3) || num.multiple?(5)
    total += num
  end
end

puts "Total: #{total}"

