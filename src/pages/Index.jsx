// Update this page (the content is just a fallback if you fail and example)
// Use chakra-ui
import { Container, Text, VStack, Heading, Button } from "@chakra-ui/react";

const Index = () => {
  return (
    <Container centerContent maxW="container.md" height="100vh" display="flex" flexDirection="column" justifyContent="center" alignItems="center">
      <VStack spacing={6}>
        <Heading as="h1" size="2xl">
          Welcome to Your Blank Canvas
        </Heading>
        <Text fontSize="lg">Chat with the agent to start making edits.</Text>
        <Button colorScheme="teal" size="lg">
          Start Chatting
        </Button>
      </VStack>
    </Container>
  );
};

export default Index;
