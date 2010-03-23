class Fixnum
  def squared
    self * self
  end
end

def p_triple?(a, b, c)
  a.squared + b.squared == c.squared
end

def prob_9
  (1..1000).each do |a|
    (a..1000).each do |b|
      c = 1000 - (a + b)
      return a*b*c if p_triple?(a, b, c)
    end
  end
  raise "failure"
end

puts "The product is: #{prob_9}"
