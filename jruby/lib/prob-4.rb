class Object
  def palindrome?
    me = self.to_s
    me == me.reverse
  end
end

def prob4
  pals = []
  999.downto(100) do |x|
    x.downto(100) do |y|
      pals << x * y if (x * y).palindrome?
    end
  end
  raise "Cannot find one" if pals.empty?
  pals.max
end

puts "The largest palindrome is: #{prob4}"
